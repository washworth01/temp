package people;

import people.ListOfPeople;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main 
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ListOfPeople people = new ListOfPeople();
		
		people.add(new Person("William Ashworth", "Student", 21));
		people.add(new Person("Richard Nixon", "POTUS", 81));
		people.add(new Person("Harold Godwinson", "King", 44));
		
		System.out.println(people.getPeople());
		
		String searchName = sc.next();
		
		System.out.println(people.serachByName(searchName));
	}
}

