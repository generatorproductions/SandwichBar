package SandyParts;

/**
 * Gathers info on sandwich parts (amount, noise)
 *
 * @author Generator Productions
 * @version 1.0
 */
abstract public class SandwichParts
{
    private static int totalParts = 0;
    
    public SandwichParts()
    {
        totalParts++;
    }
    
    /*
     * @return: Parts of the sandwich
     */
    public int getTotalParts()
    {
        return totalParts;
    }
    
    /*
     * @return: Noise of constructing the part
     */
    abstract public String noise(); 
    
    /*
     * @return: Sets original calorie count to 0
     */
    public int getCalories()
    {
        return 0;
    }
}