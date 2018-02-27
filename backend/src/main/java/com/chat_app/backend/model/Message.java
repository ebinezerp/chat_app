package com.chat_app.backend.model;

import java.io.Serializable;

public class Message implements Serializable{

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	  private int id;
	  
	  public Message() {
	    
	  }
	  
	  public Message(int id, String message) {
	    this.id = id;
	    this.message = message;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }
	}