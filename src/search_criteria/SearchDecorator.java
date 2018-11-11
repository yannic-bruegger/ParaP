package search_criteria;

import application.Person;

public abstract class SearchDecorator implements SearchCriterion
{
    protected SearchCriterion criterion;
    protected SearchDecorator decorator;

    public SearchDecorator( SearchCriterion criterion, SearchDecorator decorator )
    {
        this.criterion = criterion;
        this.decorator = decorator;
    }

    public SearchDecorator( SearchCriterion criterion )
    {
        this( criterion, null );
    }
}