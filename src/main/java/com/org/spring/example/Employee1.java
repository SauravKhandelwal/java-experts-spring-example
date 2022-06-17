package com.org.spring.example;

public class Employee1 {
	private int id;
	private String name;
	private Address address;// Aggregation

	public Employee1() {
		System.out.println("def cons");
	}

	public Employee1(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void show() {
		System.out.println("Employee:"+"[id:"+id + " " +"name:"+ name+"]");
		System.out.println(address.toString());
	}

}