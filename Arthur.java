package week3;

public class Arthur extends Person implements MainCharacter
{	
	@Override
	void eat()  // Abstract method Implementation
	{
		System.out.println("Arthur eats jerky");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Character: "+MainCharacter.name);

		Arthur a = new Arthur();
		a.activity();
		a.eat();
	}

	@Override
	public void activity() 
	{
		System.out.println("A wandering cowboy");	
	}
}
