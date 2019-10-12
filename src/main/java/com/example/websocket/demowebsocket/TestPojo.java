package com.example.websocket.demowebsocket;

public class TestPojo {
	private Integer id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "TestPojo [id=" + id + ", name=" + name + "]";
	}
	public TestPojo(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public TestPojo() {
		super();
	}
	public TestPojo(String name) {
		super();
		this.name = name;
	}
	
	

}
