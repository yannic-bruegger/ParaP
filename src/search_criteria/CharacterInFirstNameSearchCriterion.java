package search_criteria;

import application.Person;

public class CharacterInFirstNameSearchCriterion implements SearchCriterion
{
    private char character;

    public CharacterInFirstNameSearchCriterion( char character )
    {
        this.character = character;
    }

    @Override
    public boolean isMatching( Person p )
    {
        return p.firstname.contains( String.valueOf( character ) );
    }
}
