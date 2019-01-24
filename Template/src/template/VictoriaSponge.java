package template;

public class VictoriaSponge extends Cake
{
	@Override
	public void selectCake()
	{
		System.out.println("Seleced Victoria Sponge.");
	}

	@Override
	public void selectIngredients() 
	{
		System.out.println("Acquiring: unsalted butter, caster sugar, vanilla extract, medium eggs, raspberry, jam, whipped cream, icing sugar");
	}

	@Override
	public int numberOfLayers()
	{
		return 3;
	}
	
	@Override
	public boolean isGanache()
	{
		return false;
	}

}
