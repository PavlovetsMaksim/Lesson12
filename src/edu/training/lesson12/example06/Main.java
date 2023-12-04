package edu.training.lesson12.example06;

public class Main {

	public static void main(String[] args) {
		Time t = new Time(11, 28, 44);
		
		t.printTime();
		
		t.setHour(18);
		t.setMinute(40);
		t.setSecond(60);
		
		t.printTime();

	}

}
