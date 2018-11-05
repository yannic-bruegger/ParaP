package search_criteria;

import application.Person;

public class MinAgeSearchCriterion implements SearchCriterion
{
    private int     minAge;

    public MinAgeSearchCriterion( int minAge )
    {
        this.minAge = minAge;
    }

    @Override
    public boolean isMatching( Person p )
    {
        return p.age >= minAge;
    }
}
