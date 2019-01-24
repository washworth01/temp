package template;

public class ChocolateCake extends Cake
{
	@Override
	public void selectCake()
	{
		System.out.println("Seleced Chocolate Cake.");
	}

	@Override
	public void selectIngredients() 
	{
		System.out.println("Acquiring: Butter, Eggs, Sugar, Flour, Cocoa solids, Baking Powder, Vanilla");
	}

	@Override
	public int numberOfLayers()
	{
		return 3;
	}

}
