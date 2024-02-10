package com.karina.one_to_one_prac;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Story {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sid;
	String storyname;
	String storytype;
	
	@OneToOne(cascade=CascadeType.ALL)
	Book book;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStoryname() {
		return storyname;
	}

	public void setStoryname(String storyname) {
		this.storyname = storyname;
	}

	public String getStorytype() {
		return storytype;
	}

	public void setStorytype(String storytype) {
		this.storytype = storytype;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
