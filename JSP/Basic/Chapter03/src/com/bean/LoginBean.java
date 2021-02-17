package com.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {
	
	private static final long serialVersionUID = 111111;
	
	private String userid;
	private String passwd;
	
	final String uid = "myuser";
	final String pw = "12345";
		
	public boolean checkUser() {
		if(userid.equals(uid) && passwd.equals(pw))
			return true;
		else
			return false;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	
}