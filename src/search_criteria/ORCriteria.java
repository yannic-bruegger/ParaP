package search_criteria;

import application.Person;

import java.util.Iterator;

public class ORCriteria extends ComplexSearchCriterion
{
    @Override
    public boolean isMatching(Person p)
    {
        if( getCriteria().isEmpty() ) return true;
        for( SearchCriterion criterion : getCriteria() )
        {
            if( criterion.isMatching( p ) ) return true;
        }
        return false;
    }
}
