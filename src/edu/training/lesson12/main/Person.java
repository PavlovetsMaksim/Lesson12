package edu.training.lesson12.main;

public class Person {
	private String name;
	private String surname;

	public void init(String _name, String _surname) {
		name = _name;
		surname = _surname;
	}

	public void print() {
		System.out.println("name = " + name);
		System.out.println("surname = " + surname);
	}

}
