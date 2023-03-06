package com.constructor;

public class Encapsulation {
private String name = " golu";
private String email = "golu123@gmail.com";
private int number = 123456789;
public static void main(String[] args) {
	Encapsulation ec = new Encapsulation();
	System.out.println(ec.getName());
	ec.setName("annu");
	System.out.println("after updating the name :"+ec.getName());
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
}
