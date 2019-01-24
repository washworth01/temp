package garage;

public class Car extends Vehicle
{
	//Attributes
	private boolean isConvertable;
	
	
	
	//Constructors
	public Car(String regNumber, String manufacturer, String make, String colour
			,int topSpeed, boolean isConvertable)
	{
		super(regNumber, manufacturer, make, colour, topSpeed);
		this.setConvertable(isConvertable);
	}
	
	public Car(String regNumber, String manufacturer, String make, boolean isConvertable)
	{	
		this(regNumber, manufacturer, make,"Black",0, false);
	}
	
	//Methods
	@Override
	public String toString()
	{
		return "\nRegistration Number: " + getRegNumber() + "\nManufacturer: " + getManufacturer() + "\nMake: " + getMake() 
		+ "\nColour: " + getColour() + "\nTop Speed: " + getTopSpeed() + "mph" + "\nConvertable: " + isConvertable() + "\n";
	}
	
	@Override
	public int calculateCost() 
	{
		int cost = 3000;
		
		if (getTopSpeed() > 100)
		{
			cost = cost + 500;
		}
		
		if(isConvertable())
		{
			cost = cost + 400;
		}
		
		return cost;
	}
	
	public boolean isConvertable() 
	{
		return isConvertable;
	}

	public void setConvertable(boolean isConvertable) 
	{
		this.isConvertable = isConvertable;
	}
	
	//Methods
}
