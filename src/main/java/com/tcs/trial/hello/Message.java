package com.tcs.trial.hello;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	private long id;
	private String author;
	private String message;
	
	public Message(){
		
	}

	public Message(long id, String author, String message) {
		super();
		this.id = id;
		this.author = author;
		this.message = message;
	}

	public String getName() {
		return author;
	}
	public void setName(String name) {
		this.author = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
