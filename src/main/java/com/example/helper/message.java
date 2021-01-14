package com.example.helper;

public class message {
	private String content;
	private String typeString;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTypeString() {
		return typeString;
	}
	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}
	public message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public message(String content, String typeString) {
		super();
		this.content = content;
		this.typeString = typeString;
	}
	
	
	
}
