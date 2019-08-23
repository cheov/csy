package com.csy.pojo;

public class Hoppy {
	private Integer id;
	private Integer uid;
	private String uhobby;
	private User user;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUhobby() {
		return uhobby;
	}
	public void setUhobby(String uhobby) {
		this.uhobby = uhobby;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Hobby [id=" + id + ", uid=" + uid + ", uhobby=" + uhobby + ", user=" + user + "]";
	}
	

}
