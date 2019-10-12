package com.example.websocket.demowebsocket;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class ChatHandler extends TextWebSocketHandler {
	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message)
			throws InterruptedException, IOException {
		String msg=message.getPayload();
		session.sendMessage(new TextMessage("(From Server): "+msg));
		
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("Connection established!");
	}

}
