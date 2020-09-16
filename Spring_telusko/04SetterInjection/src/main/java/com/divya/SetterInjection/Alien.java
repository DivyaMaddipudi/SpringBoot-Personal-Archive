package com.divya.SetterInjection;

public class Alien {
	private int age;
	
	private Laptop laptop;
	
	public Alien() {
		System.out.println("alien object created...");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void code() {
		System.out.println("I am coding...");
		laptop.compile();
	}
	

}
