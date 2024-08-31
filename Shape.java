package week3;

abstract class Shape  // Shape Class implemented
{
	abstract double area();
}

// Deriving Sub-Classes Circle, Rectangle, Triangle

class Circle extends Shape
{
	private double radius;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	double area()  // Method to calculater area of Circle
	{
		return 3.14 * radius * radius;
	}
}

class Rectangle extends Shape
{
	private double length;
	private double breadth;
	
	Rectangle(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	double area()  // Method to calculater area of Rectangle
	{
		return length * breadth;
	}
}

class Triangle extends Shape
{
	private double base;
	private double height;
	
	Triangle(double base,double height)
	{
		this.base = base;
		this.height = height;
	}
	
	@Override
	double area()  // Method to calculater area of Triangle
	{
		return 0.5 * base * height ;
	}
}



