/*
4. Write a JAVA program to find perimeter of two rectangles using constructors. 
(use default constructor and parameterized constructor to initialize values of length and breadth of 2 rectangles respectively.) 
*/

import java.util.Scanner;

class Peri{
	double length, breadth;
	Peri(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		length = sc.nextDouble();
		System.out.print("Enter breadth: ");
		breadth = sc.nextDouble();
	}
	Peri(double l, double b){
		length = l;
		breadth = b;
	}
	void calculate(){
		System.out.println("Perimeter is "+2*(length+breadth));
	}
}

public class Rectangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Peri rect1 = new Peri();
		rect1.calculate();
		System.out.print("Enter length: ");
		double l = sc.nextDouble();
		System.out.print("Enter breadth: ");
		double b = sc.nextDouble();
		Peri rect2 = new Peri(l, b);
		rect2.calculate();
	}
}
