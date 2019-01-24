package garage;

public class Motorbike extends Vehicle
{
	//Attributes
	private int sprocketTeeth;
	
		
		
		
	//Constructors
	public Motorbike(String regNumber, String manufacturer, String make, String colour
			, int topSpeed, int sprocketTeeth)
	{
		super(regNumber, manufacturer, make, colour, topSpeed);
		this.setSprocketTeeth(sprocketTeeth);
	}
	public Motorbike(String regNumber, String manufacturer, String make
			, int sprocketTeeth)
	{
		this(regNumber, manufacturer, make, "Black", 0, 0);
	}	
	
	//Methods
	@Override
	public String toString()
	{
		return "\nRegistration Number: " + getRegNumber() + "\nManufacturer: " + getManufacturer() + "\nMake: " + getMake() 
		+ "\nColour: " + getColour() + "\nTop Speed: " + getTopSpeed() + "mph" + "\nSprocketTeeth: " + getSprocketTeeth() + "\n";
	}
	
	@Override
	public int calculateCost() 
	{
		int cost = 2000;
		
		if (getTopSpeed() > 100)
		{
			cost = cost + 500;
		}
		
		if(getSprocketTeeth() > 8)
		{
			cost = cost + 300;
		}
		
		return cost;
	}
	
	public int getSprocketTeeth() 
	{
		return sprocketTeeth;
	}
	
	public void setSprocketTeeth(int sprocketTeeth) 
	{
		this.sprocketTeeth = sprocketTeeth;
	}
}
