abstract class Shape{
	abstract void numberOfSides();
}

class Rectangle extends Shape{
	void numberOfSides(){
		System.out.println("rectangle sides: 4");
	}
}

class Triangle extends Shape{
	void numberOfSides(){
		System.out.println("triangle sides: 3");
	}
}

class Hexagon extends Shape{
	void numberOfSides(){
		System.out.println("hexagon sides: 6");
	}
}

public class TestShape{
	public static void main(String args[]){
		Shape shape;
		shape = new Rectangle();
		shape.numberOfSides()
		shape = new Triangle();
		shape.numberOfSides()
		shape = new Hexagon();
		shape.numberOfSides();
	}
}
