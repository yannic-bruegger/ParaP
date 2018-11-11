package search_criteria;

import application.Person;

import java.util.Iterator;

public class ANDCriteria extends ComplexSearchCriterion
{
    @Override
    public boolean isMatching(Person p)
    {
        boolean result = true;


        for( SearchCriterion criterion : getCriteria() )
        {
            result = result && criterion.isMatching( p );
        }

        return result;
    }
}
