package SandyParts;


/**
 * Write a description of class ProteinList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class ProteinList
{
    private static ArrayList<Protein> proteinParts = new ArrayList<Protein>();
    
    public void add(Protein g)
    {
        proteinParts.add(g);
    }
    
    public ArrayList<Protein> getList()
    {   
        return proteinParts;
    }
}
