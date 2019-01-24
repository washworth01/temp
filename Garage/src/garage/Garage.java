package garage;

import java.util.ArrayList;
import java.util.List;

public class Garage
{
	private List<Vehicle> vehicles; 
	
	public Garage()
	{
		vehicles = new ArrayList<>();
	}
	
	public void add(Vehicle v)
	{
		vehicles.add(v);
	}
	
	public List<Vehicle> getVehicles() 
	{
		return vehicles;
	}
	
	public void setVehicles(List<Vehicle> vehicles)
	{
		this.vehicles = vehicles;
	}
}
