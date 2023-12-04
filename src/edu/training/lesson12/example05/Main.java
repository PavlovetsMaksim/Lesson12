package edu.training.lesson12.example05;

public class Main {

	public static void main(String[] args) {
		DecimalCounter decCount = new DecimalCounter();
		
		decCount.increment();
		decCount.increment();
		decCount.increment();
		decCount.increment();
		
		System.out.println("Текущее значение счетчика: " + decCount.getCurVal());
		
		decCount.decrement();
		
		System.out.println("Текущее значение счетчика: " + decCount.getCurVal());
		
		decCount.decrement();
		decCount.decrement();
		decCount.decrement();		
		decCount.decrement();

	}

}
