package application;

public class Person
{
    public String   firstname, name;
    public int      age;

    public Person( String firstname, String name, int age )
    {
        this.firstname = firstname;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return firstname + " " + name + " | Alter: " + age;
    }
}
