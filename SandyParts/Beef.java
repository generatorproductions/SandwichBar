package SandyParts;

/**
 * Write a description of class Beef here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Beef extends Protein
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Thunk";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 213;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Beef";
    }
}