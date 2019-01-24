package maths;

public class Main {

	public static void main(String[] args)
	{
		float original = 1000;
		float now = 1350;

		for(int i = 0; i < 39; i++)
		{ 
			original = ((original/100) * 5) + original;
		}
		
		for(int i = 0; i < 39; i++)
		{ 
			now = ((now/100) * 2) + now;
			System.out.println(now);
		}
		
		System.out.println();
		System.out.println(original);
		System.out.println(now);
	}

}
