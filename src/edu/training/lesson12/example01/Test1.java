package edu.training.lesson12.example01;

public class Test1 {
	private int a;
	private int b;

	public Test1() {

	}

	public Test1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void printNums() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("Сумма = " + sumNums());
		System.out.println("Максимальное значение = " + maxNum());
	}

	public int sumNums() {
		int sum = a + b;

		return sum;
	}

	public int maxNum() {
		if (a > b) {
			return a;
		}

		return b;
	}

}
