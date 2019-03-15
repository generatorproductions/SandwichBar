package SandyParts;


/**
 * Write a description of class GrainList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class GrainList
{
    private static ArrayList<Grain> grainParts = new ArrayList<Grain>();
    
    public void add(Grain g)
    {
        grainParts.add(g);
    }
    
    public ArrayList<Grain> getList()
    {
        return grainParts;
    }
}
