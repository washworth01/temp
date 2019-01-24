package template;

public class LayerCake extends Cake
{
	@Override
	public void selectCake()
	{
		System.out.println("Seleced Layer Cake.");
	}

	@Override
	public void selectIngredients() 
	{
		System.out.println("Acquiring: butter, sugar, eggs, vanilla extract, baking powder, salt, flour, whole milk");
	}

	@Override
	public int numberOfLayers()
	{
		return 6;
	}
	
	@Override
	public boolean isGanache()
	{
		return false;
	}

}
