package test;

public class TestAngle {
	public static void main(String[] args) {
		TriAngle T = new TriAngle(2, 5);
		double area = T.getArea();
		System.out.println(area);
		
		TriAngle T1 = new TriAngle(2,5,3);
		double area1 = T1.getArea1();
		System.out.println(area1);
	}
}
