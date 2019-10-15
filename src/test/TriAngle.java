package test;

public class TriAngle {
	private double base;
	private double height;
	private double yu;
	public TriAngle(double b,double h) {
		this.base = b;
		this.height = h;
	}
	
	public TriAngle(double b,double h,double y) {
		this.base = b;
		this.height = h;
		this.yu = y;
	}
	
	public double getArea() {
		double area = (this.base*this.height)/2;
		return area;
	}
	
	public double getArea1() {
		double area = (this.base*this.height*this.yu)/2;
		return area;
	}
}
