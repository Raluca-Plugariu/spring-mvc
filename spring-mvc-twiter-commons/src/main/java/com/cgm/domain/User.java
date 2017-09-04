package com.cgm.domain;

import java.util.ArrayList;

public class User {
	private String username;
	private String password;
	private static ArrayList<Message> messages = new ArrayList<Message>();
	private static ArrayList<User> friends = new ArrayList<User>();
	private static ArrayList<User> allUsers = new ArrayList<User>();
	
	
	public User() {
		
	}
	
	public User(String username) {
		super();
		this.username = username;
	
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Message> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}
	public ArrayList<User> getFriends() {
		return friends;
	}
	public void setFriends(ArrayList<User> friends) {
		this.friends = friends;
	}
	public ArrayList<User> getAllUsers() {
		return allUsers;
	}
	public void setAllUsers(ArrayList<User> allUsers) {
		this.allUsers = allUsers;
	}
	
	

}
