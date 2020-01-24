package com.cetpa.beans;

public class Book {
	private int isbn;
	private String topic, author;
	private int cost;
	private String publisher;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String topic, String author, int cost, String publisher) {
		super();
		this.topic = topic;
		this.author = author;
		this.cost = cost;
		this.publisher = publisher;
	}

}
