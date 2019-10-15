package test;

public class Cylinder extends Circle{
	double height=1;
	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	protected double findArea() {
		double area = (2*super.findArea())+(2*radius*Math.PI*height);
		return area;
		
	}
	
	
	public double finVolume() {
		double area = super.findArea();
		double vol = area*height;
		return vol;
	}
	
	
}
