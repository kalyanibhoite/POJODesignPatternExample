package com.pojo.example;

public class POJODesignPatternExample {
	private String name;
	private int age;
	private String Address;
	public POJODesignPatternExample(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		Address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "POJODesignPatternExample [name=" + name + ", age=" + age + ", Address=" + Address + "]";
	}

	


}
