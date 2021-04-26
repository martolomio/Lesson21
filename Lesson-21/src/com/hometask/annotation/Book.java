package com.hometask.annotation;

public class Book {
	@MyAnnotation(params="Book's name : ")
	private String name;
	@MyAnnotation(params="Prise is : ")
	private int price;
	@MyAnnotation(params="Auhtor or auhtors : ")
	private String auhtor;
	
	private int pages;
	
	public Book(String name, int price, String auhtor, int pages) {
		super();
		this.name = name;
		this.price = price;
		this.auhtor = auhtor;
		this.pages = pages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuhtor() {
		return auhtor;
	}
	public void setAuhtor(String auhtor) {
		this.auhtor = auhtor;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", auhtor=" + auhtor + ", pages=" + pages + "]";
	}
	
	

}
