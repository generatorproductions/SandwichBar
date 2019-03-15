package SandyParts;


/**
 * Write a description of class SandyPartsList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class PartsList
{
    private static ArrayList<SandwichParts> parts = new ArrayList<SandwichParts>();
    private static ArrayList<String> easyAbbrev = new ArrayList<String>();
    private static ArrayList<String> hardAbbrev = new ArrayList<String>();
    
    public void add(SandwichParts g)
    {
        parts.add(g);
    }
    
    public void addEasyAbrev(String s)
    {
        easyAbbrev.add(s);
    }
    
    public void addHardAbrev(String s)
    {
        hardAbbrev.add(s);
    }
    
    public ArrayList<SandwichParts> getParts()
    {   
        return parts;
    }
    
    public ArrayList<String> getEasyAbbrev()
    {   
        return easyAbbrev;
    }
    
    public ArrayList<String> getHardAbbrev()
    {   
        return hardAbbrev;
    }
    
    
    
}
