package com.project.spring.Entity;

public class Agent {
	
	private int id;
	private String name;
	private String area;
	
	
	
	public Agent(int id, String name, String area) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
	}
	
	
	public Agent(int id) {
		super();
		this.id = id;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

}
