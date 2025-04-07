public class Animal
{
    private String name;
    private String species;

    public Animal()
    {
        name = "This is the default name ";

        species = "This is the defualt species ";

        //can also just do this 

        this(null,null);
    }

    public Animal(String name, String species)
    {
        this.name = name;

        this.species = species;
    }

}