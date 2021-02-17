package com.bean;

import java.io.Serializable;

public class MemberBean implements Serializable {
	private static final long serialVersionUID = 12345;
	
	private int id = 2021100;
	private String name = "장그래";
	
	//public MemberBean() {}	기본 생성자 생략 되어 있음.
	
	//getter, setter
	
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
	
	

}
