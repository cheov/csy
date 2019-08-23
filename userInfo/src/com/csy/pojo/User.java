package com.csy.pojo;

import java.util.Date;

public class User {
	private Integer id;
	private String userName;
	private String pwd;
	private String hobby;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public User(Integer id, String userName, String pwd, String hobby) {
		super();
		this.id = id;
		this.userName = userName;
		this.pwd = pwd;
		this.hobby = hobby;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", pwd=" + pwd + ", hobby=" + hobby + "]";
	}
	
}
