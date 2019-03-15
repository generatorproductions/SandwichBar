package SandyParts;


/**
 * A list for Veggies
 *
 * @author GeneratorProductions
 * @version 1.0
 */
import java.util.*;

public class VeggieList
{
    private static ArrayList<Veggie> veggieParts = new ArrayList<Veggie>();
    
    /**
    * @param: A Veggie
    * Adds the  Veggie to an ArrayList of Veggies
    */
    public void add(Veggie g)
    {
        veggieParts.add(g);
    }
    
    /**
    * @return: An ArrayList of Veggies
    * gets the veggieParts ArrayList and returns it
    */
    public ArrayList<Veggie> getList()
    {   
        return veggieParts;
    }
}
