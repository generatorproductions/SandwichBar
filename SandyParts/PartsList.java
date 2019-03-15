package SandyParts;


/**
 * A list for all SandwichParts and abbreviations
 *
 * @author Generator Productions
 * @version 1.0
 */
import java.util.*;

public class PartsList
{
    private static ArrayList<SandwichParts> parts = new ArrayList<SandwichParts>();
    private static ArrayList<String> easyAbbrev = new ArrayList<String>();
    private static ArrayList<String> hardAbbrev = new ArrayList<String>();
    
    /**
     * @param : A SandwichParts
     * Adds a SandwichParts to an ArrayList
     */
    public void add(SandwichParts g)
    {
        parts.add(g);
    }
    
    /**
    * @param : A String of an abbreviation
    * Addes the easy abbreviation to the easyAbbrev ArrayList
    */
    public void addEasyAbrev(String s)
    {
        easyAbbrev.add(s);
    }
    
    /**
    * @param : A String of an abbreviation
    * Addes the hard abbreviation to the hardAbbrev ArrayList
    */
    public void addHardAbrev(String s)
    {
        hardAbbrev.add(s);
    }
    
    /**
    * @return: returns an ArrayList of sandwich parts.
    */
    public ArrayList<SandwichParts> getParts()
    {   
        return parts;
    }
    
    /**
    *   @return: returns an ArrayList of abbreveations
    */
    public ArrayList<String> getEasyAbbrev()
    {   
        return easyAbbrev;
    }
    
    /**
    *   @return: returns an ArrayList of abbreveations
    */
    public ArrayList<String> getHardAbbrev()
    {   
        return hardAbbrev;
    }
    
    
    
}
