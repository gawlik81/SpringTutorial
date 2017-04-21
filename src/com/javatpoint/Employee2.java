/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package com.javatpoint;

public class Employee2 {
private int id;
private String name;
private Address2 address;
public Employee2() {}

public Employee2(int id, String name, Address2 address) {
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