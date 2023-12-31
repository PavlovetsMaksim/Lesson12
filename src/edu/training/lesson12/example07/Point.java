package edu.training.lesson12.example07;

public class Point {
	public double x;
	public double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static double distance(Point a, Point b) {
		double dx = a.x - b.x;
		double dy = a.y - b.y;
		
		return Math.sqrt(dx * dx + dy * dy);
	}

	public void print() {
		System.out.println("x: " + x + ", y: " + y);
	}
	
}
