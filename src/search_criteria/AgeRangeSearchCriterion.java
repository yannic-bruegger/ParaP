package search_criteria;

import application.Person;

public class AgeRangeSearchCriterion implements SearchCriterion
{
    private int     ageFrom;
    private int     ageTo;

    public AgeRangeSearchCriterion( int ageFrom, int ageTo )
    {
        this.ageFrom = ageFrom;
        this.ageTo = ageTo;
    }

    @Override
    public boolean isMatching( Person p )
    {
        return p.age >= ageFrom && p.age <= ageTo;
    }
}
