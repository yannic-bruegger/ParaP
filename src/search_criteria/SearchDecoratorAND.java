package search_criteria;

import application.Person;

public class SearchDecoratorAND extends SearchDecorator
{
    public SearchDecoratorAND( SearchCriterion criterion, SearchDecorator decorator )
    {
        super( criterion, decorator );
    }

    @Override
    public boolean isMatching( Person p )
    {
        if( decorator == null ) return criterion.isMatching( p );
        return criterion.isMatching( p ) && decorator.isMatching( p );
    }
}