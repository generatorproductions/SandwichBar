package SandyParts;

/**
 * Write a description of class Lettuce here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lettuce extends Veggie
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Crunch";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 2;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Lettuce";
    }
}