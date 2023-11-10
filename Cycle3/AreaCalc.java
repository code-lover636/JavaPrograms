import java.util.Scanner;

public class AreaCalc{
	static double calcArea(double ...dim){
		switch(dim.length){
			case 1:
				return Math.PI * Math.pow(dim[0], 2);
			case 2:
				return dim[0] * dim[1];
			case 3:
				double s = (dim[0] + dim[1] + dim[2]) /2;
				return Math.sqrt(s*(s-dim[0])*(s-dim[1])*(s-dim[2]));
			default:
				System.out.println("Shape not supported.");
				return 0.0;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//Circle
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		System.out.println("Area of circle is " + calcArea(radius));
		//Rectangle
		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		System.out.print("Enter breadth: ");
		double breadth = sc.nextDouble();
		System.out.println("Area of rectangle is " + calcArea(length, breadth));
		//Triangle
		System.out.print("Enter side1: ");
		double side1 = sc.nextDouble();
		System.out.print("Enter side2: ");
		double side2 = sc.nextDouble();
		System.out.print("Enter side3: ");
		double side3 = sc.nextDouble();
		System.out.println("Area of traingle is " + calcArea(side1, side2, side3));
	}
}
