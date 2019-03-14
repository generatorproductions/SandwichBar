package SandyParts;

/**
 * Write a description of class Hummus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hummus extends Sauce
{
    /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Shlup";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 25;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Hummus";
    }
}