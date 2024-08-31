package week3;

class VehicleMain 
{
	static void display(Vehicle obj)
	{
		obj.start();
	}

	public static void main(String[] args) 
	{
		// Calling Super Class method
		display(new Vehicle());

		// Upcasting using a new method.
		display(new Car()); 
		display(new Bike()); 
	}
}
