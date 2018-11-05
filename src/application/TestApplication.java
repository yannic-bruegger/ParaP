package application;

import search_criteria.*;

import javax.swing.*;
import java.util.Iterator;

public class TestApplication
{
    private static final int CRITERIAOPTION = 8;

    public static void main( String[] args )
    {
        PersonDirectory poesiealbum = new PersonDirectory();

        Person p0 = new Person( "Franzi",   "Fridel",       8 );
        Person p1 = new Person( "Marta",    "Munter",       43 );
        Person p2 = new Person( "Uwe",      "Ulkig",        77 );
        Person p3 = new Person( "Fridolin", "Fröhlich",     20 );
        Person p4 = new Person( "Hanna",    "Heiter",       21 );
        Person p5 = new Person( "Gerda",    "Glücklich",    32 );
        Person p6 = new Person( "Thomas",   "Tierlieb",     56 );
        Person p7 = new Person( "Herta",    "Hochgestimmt", 78 );
        Person p8 = new Person( "Uwe",      "Unbeschwert",  42 );
        Person p9 = new Person( "Moritz",   "Munter",       19 );

        poesiealbum.addPerson( p0 );
        poesiealbum.addPerson( p1 );
        poesiealbum.addPerson( p2 );
        poesiealbum.addPerson( p3 );
        poesiealbum.addPerson( p4 );
        poesiealbum.addPerson( p5 );
        poesiealbum.addPerson( p6 );
        poesiealbum.addPerson( p7 );
        poesiealbum.addPerson( p8 );
        poesiealbum.addPerson( p9 );


        SearchCriterion criterion = null;
        switch ( CRITERIAOPTION ){
            case 0:
                criterion = new AgeRangeSearchCriterion( 0, 20 );
                break;
            case 1:
                criterion = new CharacterInFirstNameSearchCriterion( 'F' );
                break;
            case 2:
                criterion = new FirstNameSearchCriterion( "Uwe" );
                break;
            case 3:
                criterion = new FullNameSearchCriterion( "Marta", "Munter" );
                break;
            case 4:
                criterion = new MinAgeSearchCriterion( 21 );
                break;
            case 5:
                criterion = new ANDCriteria().addCriterion( new CharacterInFirstNameSearchCriterion( 'M' ) ).addCriterion( new AgeRangeSearchCriterion( 0, 21 ) );
                break;
            case 6:
                criterion = new ORCriteria().addCriterion( new CharacterInFirstNameSearchCriterion( 'M' ) ).addCriterion( new AgeRangeSearchCriterion( 0, 21 ) );
                break;
            case 7:
                criterion = new ANDCriteria();
                break;
            case 8:
                criterion = new ORCriteria();
                break;
            default: throw new UnsupportedOperationException();
        }

        Iterator<Person> foundPersons = poesiealbum.findPersons( criterion );
        while( foundPersons.hasNext() )
        {
            System.out.println( foundPersons.next() );
        }
    }
}
