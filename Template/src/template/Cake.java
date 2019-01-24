package template;

public abstract class Cake 
{
	//Template
	public final void makeCake() 
	{
		selectCake();
		selectIngredients();
		mixing(numberOfLayers());
		
		if(isGanache())
		{
			addGanache();
		}
	}
	
	public abstract void selectCake();
	public abstract void selectIngredients();
	public abstract int numberOfLayers();
	
	public void mixing(int layers)
	{
		int minutes = 5;
		
		if (layers > 5)
		{
			minutes = minutes*2;
		}
		System.out.println("Mixing ingredients for " +  minutes + " minutes.");
	}
		
	public void addGanache()
	{
		System.out.println("Pouring Ganache");
	}
	
	public boolean isGanache()
	{
		return true;
	}
	
	
}
