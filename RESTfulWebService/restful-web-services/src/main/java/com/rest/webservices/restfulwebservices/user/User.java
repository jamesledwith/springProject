package com.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {

	private Integer id;
	private String name;
	private Date birthdate;
	
	protected User() {
		
	}
	
	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, birthdate=%s]", id, name, birthdate);
	}
	
	public Integer getId() {
		return id;
	}
	public User(Integer id, String name, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}
	public String getName() {
		return name;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
}
