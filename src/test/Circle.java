package test;

public class Circle {
	protected double radius=1;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	protected double findArea() {
		double area = Math.PI*radius*radius;
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
