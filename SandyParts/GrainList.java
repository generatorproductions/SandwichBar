package SandyParts;


/**
 * A list for Grains
 *
 * @author Generator Productions
 * @version 1.0
 */
import java.util.*;

public class GrainList
{
    private static ArrayList<Grain> grainParts = new ArrayList<Grain>();
    
    /**
     * Adds a Grain to the Grain ArrayList
     */
    public void add(Grain g)
    {
        grainParts.add(g);
    }
    
     /**
     * @return: the Grain ArrayList
     */
    public ArrayList<Grain> getList()
    {
        return grainParts;
    }
}
