package SandyParts;

/**
 * 
 *
 * @author Generator Productions
 * @version 1.0
 */

import java.util.*;

abstract public class Grain extends SandwichParts
{
    private static GrainList list = new GrainList();
    
    public Grain()
    {
        super();
        list.add(this);
    }
        
    /*
     * @return: Calorie count of grains
     */
    abstract public int getCalories();
    
    
}