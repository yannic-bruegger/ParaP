package search_criteria;

import application.Person;

public abstract class SearchDecorator implements SearchCriterion
{
    public SearchCriterion criterion;
    public SearchDecorator decorator;

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