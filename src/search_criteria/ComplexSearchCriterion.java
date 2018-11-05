package search_criteria;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class ComplexSearchCriterion implements SearchCriterion
{
    private ArrayList<SearchCriterion> criteria = new ArrayList<>();

    public ComplexSearchCriterion addCriterion( SearchCriterion criterion )
    {
        criteria.add( criterion );
        return this;
    }

    public ArrayList<SearchCriterion> getCriteria()
    {
        return criteria;
    }

}
