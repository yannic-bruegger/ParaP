package search_criteria;

import application.Person;

public class FullNameSearchCriterion implements SearchCriterion
{
    private String firstname;
    private String name;

    public FullNameSearchCriterion( String firstname, String name )
    {
        this.firstname  = firstname;
        this.name       = name;
    }

    @Override
    public boolean isMatching( Person p )
    {
        return p.firstname == firstname && p.name == name;
    }
}
