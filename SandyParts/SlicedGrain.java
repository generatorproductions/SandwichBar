package SandyParts;

/**
 * Write a description of class SlicedGrain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SlicedGrain extends Sliced
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Schwhap";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 69;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Sliced Grain Bread";
    }
}