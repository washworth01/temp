package people;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfPeople
{
	private List<Person> people;
	
	public ListOfPeople()
	{
		people = new ArrayList<>();
	}
	
	public void add(Person p)
	{
		people.add(p);
	}
	
	public List<Person> serachByName(String name)
	{
		return people.stream()
		.filter(person -> person.getName().equals(name))
		.collect(Collectors.toList());
	}
	
	public List<Person> getPeople()
	{
        return people;
    }

    public void setPeople(List<Person> pepole)
    {
        this.people = people;
    }
}
