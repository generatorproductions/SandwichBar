package SandyParts;

/**
 * A list for the Sauces
 *
 * @author: Generator Productions
 * @version: 1.0
 */
import java.util.*;

public class SauceList
{
    private static ArrayList<Sauce> sauceParts = new ArrayList<Sauce>();
    
    /*
     * Adds a Sauce to the Sauce ArrayList
     * @param: Takes in a Sauce to add
     */
    public void add(Sauce g)
    {
        sauceParts.add(g);
    }
    
    /*
     * Gets a Sauce to the Sauce ArrayList
     * @return: A Sauce
     */
    public ArrayList<Sauce> getList()
    {
        return sauceParts;
    }
}
