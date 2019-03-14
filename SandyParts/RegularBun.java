package SandyParts;

/**
 * Write a description of class RegularBun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RegularBun extends Bun
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Plop";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 84;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Regular Bun";
    }
    
}