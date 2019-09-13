package com.mahendra.models;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Message implements Serializable {
	
	private Date date;
	private String sender;
	private String message;
	
	public Message() {
		date = new Date();
	}
	
	
	public void setDate(Date date) {
		this.date = date;
	}


	public Date getDate() {
		return date;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
