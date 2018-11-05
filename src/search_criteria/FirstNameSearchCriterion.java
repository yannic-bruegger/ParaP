package search_criteria;

import application.Person;

public class FirstNameSearchCriterion implements SearchCriterion
{
    private String  firstname;

    public FirstNameSearchCriterion( String firstname )
    {
        this.firstname = firstname;
    }

    @Override
    public boolean isMatching( Person p )
    {
        return p.firstname == firstname;
    }
}
