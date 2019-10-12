package com.example.websocket.demowebsocket;

import java.io.IOException;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class TestDecoder implements Decoder.Text<TestPojo>{

	@Override
	public void init(EndpointConfig endpointConfig) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TestPojo decode(String s) throws DecodeException {
		// TODO Auto-generated method stub
		TestPojo parsedVal=null;
		if(willDecode(s)) {
//			System.out.println("HELLO");
//			System.out.println(s);
			
			try {
				System.out.println("HELLO"+s);
				
				TestPojo testPojo=new ObjectMapper().readValue(s, TestPojo.class);

				System.out.println(testPojo);
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Gson gson = new Gson();

//			System.out.println(gson.fromJson(gson.toJson(s), TestPojo.class));
			parsedVal=gson.fromJson(s, TestPojo.class);	
			/*
			 * final ObjectMapper mapper = new ObjectMapper(); try {
			 * parsedVal=mapper.readValue(s, TestPojo.class);
			 * System.out.println(mapper.readValue("{\"id\":1,\"name\":\"test\"}",
			 * TestPojo.class)); } catch (JsonParseException e) { // TODO Auto-generated
			 * catch block e.printStackTrace(); } catch (JsonMappingException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); } catch (IOException e) { //
			 * TODO Auto-generated catch block e.printStackTrace(); }
			 */
		}
		return parsedVal;
	}

	@Override
	public boolean willDecode(String s) {
		// TODO Auto-generated method stub
		 try {
		       final ObjectMapper mapper = new ObjectMapper();
		       mapper.readTree(s);
		       return true;
		    } catch (IOException e) {
		       return false;
		    }
		
	}

}
