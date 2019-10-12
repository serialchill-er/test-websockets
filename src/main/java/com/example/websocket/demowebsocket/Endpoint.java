package com.example.websocket.demowebsocket;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value="/echorev",decoders= TestDecoder.class)
public class Endpoint {
	
	@OnMessage
	public void handleMessage(Session session, TestPojo message) throws IOException {
		message.setName(new StringBuilder(message.getName()).reverse().toString());
		session.getBasicRemote().sendText("(Server): "+
				message.toString());
	}
}
