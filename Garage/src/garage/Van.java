package garage;

public class Van extends Vehicle
{
	//Attributes
	private int capasity;
	
	//Constructors
	public Van(String regNumber, String manufacturer,String make, String colour,
			int topSpeed, int capasity)
	{
		super(regNumber, manufacturer, make, colour, topSpeed);
		this.capasity = capasity;
	}
	
	public Van(String regNumber, String manufacturer, String make, int capasity)
	{
		this(regNumber, manufacturer, make, "Black", 0, 0);
	}
	
	//Methods
	@Override
	public String toString()
	{
		return "\nRegistration Number: " + getRegNumber() + "\nManufacturer: " + getManufacturer() + "\nMake: " + getMake() 
		+ "\nColour: " + getColour() + "\nTop Speed: " + getTopSpeed() + "mph" + "\nCapasity: " + getCapasity() + "\n";
	}
	
	public int calculateCost() 
	{
		int cost = 4000;
		
		if (getTopSpeed() > 100)
		{
			cost = cost + 500;
		}
		
		if(getCapasity() > 50)
		{
			cost = cost + 600;
		}
		
		return cost;
	}
	
	public int getCapasity()
	{
		return capasity;
	}

	public void setCapasity(int capasity) 
	{
		this.capasity = capasity;
	}
	
}
