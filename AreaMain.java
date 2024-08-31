package week3;

class AreaMain 
{
	public static void main(String[] args) 
	{
		Shape c = new Circle(5.6);
		System.out.println("Area of the Circle: "+c.area());
		System.out.println("----");
		
		Shape r = new Rectangle(12,3.6);
		System.out.println("Area of the Rectangle: "+r.area());
		System.out.println("----");
		
		Shape t = new Triangle(4.5,6.3);
		System.out.println("Area of the Triangle: "+t.area());
		System.out.println("----");
	}
}
