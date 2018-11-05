package application;

import search_criteria.SearchCriterion;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonDirectory
{
    private ArrayList<Person> directory = new ArrayList<>();

    public void addPerson( Person p )
    {
        directory.add( p );
    }

    public Person findPerson( SearchCriterion criterion )
    {
        for( Person p : directory )
        {
            if( criterion.isMatching( p ) ) return p;
        }
        return null;
    }

    public Iterator<Person> findPersons( SearchCriterion criterion )
    {
        ArrayList<Person> filteredDirectory = new ArrayList<>();

        for( Person p : directory )
        {
            if( criterion.isMatching( p ) ) filteredDirectory.add( p );
        }

        return filteredDirectory.iterator();
    }
}
