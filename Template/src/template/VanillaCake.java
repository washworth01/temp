package template;

public class VanillaCake extends Cake
{

	@Override
	public void selectCake()
	{
		System.out.println("Seleced Vanilla Cake.");
	}

	@Override
	public void selectIngredients() 
	{
		System.out.println("Acquiring: butter, caster sugar, 3 eggs, flour, baking powder, vanilla, salt");
	}

	@Override
	public int numberOfLayers()
	{
		return 4;
	}

}