package SandyParts;

/**
 * Gathers info on sandwich parts (amount, noise)
 *
 * @author Generator Productions
 * @version 1.0
 */
import java.util.*;

abstract public class SandwichParts
{
    private static PartsList list = new PartsList();
    private static int totalParts = 0;
    
    public SandwichParts()
    {
        totalParts++;
        list.add(this);
        list.addEasyAbrev(this.getEasyAbrev());
        list.addHardAbrev(this.getHardAbrev());
    }
    
    /**
     * @return: Parts of the sandwich
     */
    public int getTotalParts()
    {
        return totalParts;
    }
    
    /**
     * @return: Noise of constructing the part
     */
    abstract public String noise(); 
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    abstract public String getEasyAbrev();
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    abstract public String getHardAbrev();
    
    /**
     * @return: Sets original calorie count to 0
     */
    public int getCalories()
    {
        return 0;
    }
}