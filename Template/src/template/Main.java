package template;

public class Main {

	public static void main(String[] args) 
	{
		ChocolateCake cake1 = new ChocolateCake();
		cake1.makeCake();
		
		System.out.println();
		
		VictoriaSponge cake2 = new VictoriaSponge();
		cake2.makeCake();
		
		System.out.println();
		
		VanillaCake cake3 = new VanillaCake();
		cake3.makeCake();
		
		System.out.println();
		
		LayerCake cake4 = new LayerCake();
		cake4.makeCake();
	}

}
