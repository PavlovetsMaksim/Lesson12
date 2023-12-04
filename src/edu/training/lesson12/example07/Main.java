package edu.training.lesson12.example07;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(5, 1);
		Point p3 = new Point(3, 5);

		Triangle t = new Triangle(p1, p2, p3);

		t.print();

		System.out.println();
		
		System.out.println("Площадь = " + t.square());
		System.out.println("Периметр = " + t.perimeter());
		System.out.print("Точки пересечения меридиан = ");
		t.median_crossing().print();

	}

}
