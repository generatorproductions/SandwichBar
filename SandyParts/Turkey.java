package SandyParts;

/**
 * Write a description of class Meat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Turkey extends Protein
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Splat";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 54;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Turkey";
    }
}