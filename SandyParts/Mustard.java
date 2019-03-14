package SandyParts;

/**
 * Write a description of class Mustard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mustard extends Sauce
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Squirt";
    }
    
     /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 3;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Mustard";
    }
}