package Javathis;

public class usageThis {

	String name;
	int age;

	usageThis() {

		System.out.println("default constructor");

	}
	
	usageThis(int age){
		this.age= age;
		System.out.println("The age is===>" +age);
	}

	usageThis(String name, int age) {
		//this();// calling default constructor
		this(age);
		this.name = name;
		this.age = age;
	}

	
	public static void main(String[] args) {

		usageThis us = new usageThis("Nayana", 35);

		us.display();

	}

	public void display() {
		//this.sum();
	     sum();
      	System.out.println("Name :==>" + name + " and the age is===>" + age);

	}
	
	public void sum() {
		int a=10;
		int b=20;
		System.out.println("Sum of nos is==>" +(a+b));
	}

}
