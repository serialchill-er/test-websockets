package com.example.websocket.demowebsocket;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echorev")
public class Endpoint {
	
	@OnMessage
	public void handleMessage(Session session, String message) throws IOException {
		session.getBasicRemote().sendText(
				"(From Server Again): " + new StringBuilder(message).reverse());
	}
}
