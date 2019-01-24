package garage;

import garage.Garage;

public class Main 
{
	public static void main(String[] args)
	{
		Garage vehicles = new Garage();
		
		vehicles.add(new Car("AH58 QXZ", "Honda", "Civic", "Orange", 120, false));
		vehicles.add(new Motorbike("AB51 TJW", "BMW", "G310GS", "Red", 140, 9));
		vehicles.add(new Van("ER12 FGD", "Ford", "Transit", "White", 120, 80));
		
		System.out.println(vehicles.getVehicles());
		System.out.println(vehicles.getVehicles(vehicles.calculateCost()));
	
	}
}
