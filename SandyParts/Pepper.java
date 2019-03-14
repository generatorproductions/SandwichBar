package SandyParts;

/**
 * Write a description of class Pepper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pepper extends Veggie
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Pop";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 8;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Pepper";
    }
}