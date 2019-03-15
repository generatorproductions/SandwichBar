package SandyParts;


/**
 * Write a description of class VeggieList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class VeggieList
{
    private static ArrayList<Veggie> veggieParts = new ArrayList<Veggie>();
    
    public void add(Veggie g)
    {
        veggieParts.add(g);
    }
    
    public ArrayList<Veggie> getList()
    {   
        return veggieParts;
    }
}
