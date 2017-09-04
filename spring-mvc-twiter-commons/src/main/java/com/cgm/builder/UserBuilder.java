package com.cgm.builder;

import java.util.ArrayList;

import com.cgm.domain.Message;
import com.cgm.domain.User;

public class UserBuilder {
	public static ArrayList<Message> allMessages = new ArrayList<Message>();
	public static ArrayList<Message> userMessages = new ArrayList<Message>();
	public static ArrayList<User> allUsers = new ArrayList<User>();
	public static ArrayList<User> userFriends = new ArrayList<User>();
	
	public static ArrayList<User> populateTwiter(){
		
		allUsers.add(new User("laura.andrici"));
		allUsers.add(new User("adrian.popovici"));
		allUsers.add(new User("mircea.mihai"));
		allUsers.add(new User("mada.arhip"));	
		return  allUsers;
	
	}
	public static Message aMessage() {
		Message message = new Message("");
		return message;
	}
	public static User anUser() {
		User anUser = new User("raluca.plugariu");
		anUser.setPassword("raluca11");
		return anUser;
	}
	
	public static User newUser() {
		return new User();
	}
	
	public static ArrayList<User> folowUser( User userToFollow){
		anUser().getFriends().add(userToFollow);
		return anUser().getFriends();
		
	}
	
	public static void postMessage( Message message) {
		userMessages.add(message);

		
	}
static {
		allMessages.add(new Message("Hello! I'm Laura"));
		allMessages.add(new Message("Hello! I'm Adrian"));
		userMessages.add(new Message(" "));
		userFriends.add(new User("laura.andrici"));
		allUsers.add(new User("laura.andrici"));
		allUsers.add(new User("adrian.popovici"));
		allUsers.add(new User("mircea.mihai"));
		allUsers.add(new User("mada.arhip"));	
		
	}
	
}
