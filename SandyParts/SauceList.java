package SandyParts;


/**
 * Write a description of class SauceList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class SauceList
{
    private static ArrayList<Sauce> sauceParts = new ArrayList<Sauce>();
    
    public void add(Sauce g)
    {
        sauceParts.add(g);
    }
    
    public ArrayList<Sauce> getList()
    {
        return sauceParts;
    }
}
