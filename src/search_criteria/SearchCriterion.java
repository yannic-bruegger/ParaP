package search_criteria;

import application.Person;

public interface SearchCriterion
{
    boolean isMatching( Person p );
}
