import java.util.Scanner;

class CalcArea{

	void calculate(double side){
		System.out.println("Area of square is "+side*side);
	}
	void calculate(float radius){
		System.out.println("Area of circle is "+Math.PI*radius*radius);
	}
	void calculate(double base, double height){
		System.out.println("Area of triangle is "+(base*height)/2);
	}
}

public class Area{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		CalcArea shape = new CalcArea();
		System.out.print("Enter side of square: ");
		shape.calculate(sc.nextDouble());
		System.out.print("Enter radius of circle: ");
		shape.calculate(sc.nextFloat());
		System.out.print("Enter base of triangle: ");
		double base = sc.nextDouble();
		System.out.print("Enter base of triangle: ");
		double height = sc.nextDouble();
		shape.calculate(base, height);
	}
}
