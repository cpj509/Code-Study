package com.bean;

import java.io.Serializable;

public class MemberBean implements Serializable {
	private static final long serialVersionUID = 12345;
	
	private int id = 2021100;
	private String name = "��׷�";
	
	//public MemberBean() {}	�⺻ ������ ���� �Ǿ� ����.
	
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
