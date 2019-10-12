package com.example.websocket.demowebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@SpringBootApplication
public class DemoWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebsocketApplication.class, args);
	}
	
	@Bean
	public ServerEndpointExporter serverEndpointExporter() {
		return new ServerEndpointExporter();
	}
	
	@Bean
	public Endpoint endpoint() {
		return new Endpoint();
	}
 
}
