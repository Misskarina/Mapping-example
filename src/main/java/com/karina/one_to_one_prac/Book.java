package com.karina.one_to_one_prac;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int bid;
	String bookname;
	int price;
	
	@OneToOne(cascade=CascadeType.ALL)
	Story story;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Story getStory() {
		return story;
	}

	public void setStory(Story story) {
		this.story = story;
	}
	

}
