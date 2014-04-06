package me.zeph.spring.restful.demo.model;

public class Car {
	private String name;
	private int price;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
