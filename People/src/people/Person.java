package people;

public class Person 
{
	int personAge;
	String personFullName;
	String personOccupation;
	
	public Person(String fullName, String occupation, int age)
	{
		personFullName = fullName;
		personOccupation = occupation;
		personAge = age;
	}
	
	public String getName()
	{
		return personFullName;
	}
	
	public String getOccupation()
	{
		return personOccupation;
	}
	
	public void setAge(int age)
	{
		personAge = age;
	}
	
	public int getAge()
	{
		return personAge;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + getName() + "\n Job Title: " + getOccupation() +"\n Age: " + getAge() + "\n\r";
	}
	
}
