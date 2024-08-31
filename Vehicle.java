package week3;

public class Vehicle 
{
	void start()
	{
		System.out.println("Vehicle started");
	}
}

class Car extends Vehicle  
{
	@Override  
	void start()
	{
		System.out.println("Car started");
	}
}

class Bike extends Vehicle  
{
	@Override  
	void start()
	{
		System.out.println("Bike started");
	}
}

