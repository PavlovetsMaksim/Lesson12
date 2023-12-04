package edu.training.lesson12.example03;

import java.util.Arrays;

public class Student {

	public int[] marks;
	private String surname;
	private String name;
	private int groupNumber;

	public Student(String surname, String name, int groupNumber, int[] marks) {
		this.surname = surname;
		this.name = name;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public boolean isPerfectStudent() {
		int count = 0;
		for (int mark : marks) {
			if (mark == 9 || mark == 10) {
				count++;
			}
		}
		
		if (count == 5) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return surname + " " + name + ", группа: " + groupNumber + ", оценки: " + Arrays.toString(marks);
	}
}
