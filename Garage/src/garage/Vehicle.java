package garage;

public abstract class Vehicle implements CalculateCost
{
	//Attributes
	private String manufacturer;
	private String make;
	private String regNumber;
	private String colour;
	private int topSpeed;	
		
	//Constructors
	public Vehicle(String regNumber, String manufacturer, String make)
	{
		this.regNumber = regNumber;
		this.manufacturer = manufacturer;
		this.make = make;
		this.colour = "Black";
		this.topSpeed = 0;
	}
	public Vehicle(String regNumber, String manufacturer, String make, String colour
			, int topSpeed)
	{
		this.regNumber = regNumber;
		this.manufacturer = manufacturer;
		this.make = make;
		this.colour = colour;
		this.topSpeed = topSpeed;
	}
	
	//Methods
	public String getManufacturer() 
	{
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) 
	{
		this.manufacturer = manufacturer;
	}
	public String getMake() 
	{
		return make;
	}
	
	public void setMake(String make)
	{
		this.make = make;
	}
	public String getRegNumber() 
	{
		return regNumber;
	}
	
	public void setRegNumber(String regNumber) 
	{
		this.regNumber = regNumber;
	}
	
	public String getColour()
	{
		return colour;
	}
	public void setColour(String colour) 
	{
		this.colour = colour;
	}
	
	public int getTopSpeed()
	{
		return topSpeed;
	}
	
	public void setTopSpeed(int topSpeed) 
	{
		this.topSpeed = topSpeed;
	}
}