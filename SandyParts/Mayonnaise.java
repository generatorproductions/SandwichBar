package SandyParts;

/**
 * Write a description of class Mayonnaise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mayonnaise extends Sauce
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Sploosh";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 94;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Mayonnaise";
    }
}