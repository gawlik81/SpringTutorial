package com.javatpoint;

public class Employee7 {
private int id;
private String name;
private Address7 address;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Address7 getAddress() {
	return address;
}
public void setAddress(Address7 address) {
	this.address = address;
}
void displayInfo(){
	System.out.println(id+" "+name);
	System.out.println(address);
}

}