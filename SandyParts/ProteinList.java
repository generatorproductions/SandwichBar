package SandyParts;

/**
 * A list for the Proteins
 *
 * @author: Generator Productions
 * @version: 1.0
 */
import java.util.*;

public class ProteinList
{
    private static ArrayList<Protein> proteinParts = new ArrayList<Protein>();
    
    /*
     * Adds a Protein to the Protein ArrayList
     * @param: Takes in a Protein to add
     */
    public void add(Protein g)
    {
        proteinParts.add(g);
    }
    
    /*
     * Gets a Protein from the ArrayList
     */
    public ArrayList<Protein> getList()
    {   
        return proteinParts;
    }
}
