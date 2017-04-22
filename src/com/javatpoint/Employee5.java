package com.javatpoint;

public class Employee5 {
private int id;
private String name;
private Address5 address;
public Employee5() {}

public Employee5(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Employee5(int id, String name, Address5 address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

void show(){
	System.out.println(id+" "+name);
	System.out.println(address);
}

}