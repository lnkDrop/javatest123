package test;

public class TestCylinder {
	
	public static void main(String[] args) {
		Cylinder cy = new Cylinder(1, 5);
		Circle cr = new Circle(1);
		System.out.println("圆柱底面积是："+cr.findArea());
		System.out.println("圆柱体积是："+cy.finVolume());
		System.out.println("圆柱表面积是："+cy.findArea());
		
	}
}
