package SandyParts;

/**
 * Chicken
 *
 * @author Generator Productions
 * @version 1.0
 */
public class Chicken extends Protein
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Thud";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 335;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Chicken";
    }
}