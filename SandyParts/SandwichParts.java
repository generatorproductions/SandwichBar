package SandyParts;

/**
 * Write a description of class SandwichParts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract public class SandwichParts
{
    private static int totalParts = 0;
    
    public SandwichParts()
    {
        totalParts++;
    }
    
    public int getTotalParts()
    {
        return totalParts;
    }
    
    abstract public String noise(); // Returns the noise of constructing the part
    // Returns the calorie count of the food 
    public int getCalories()
    {
        return 0;
    }
    
    
}