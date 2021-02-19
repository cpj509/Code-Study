package com.dao;

import java.io.Serializable;

public class AddrBook implements Serializable {

	/**
	 * AddrBook 클래스 = 참조 자료형
	 */
	
	
	private static final long serialVersionUID = 100;
	
	private String username;
	private String tel;
	private String email;
	private String sex;
	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
