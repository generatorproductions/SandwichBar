package SandyParts;

/**
 * Onion
 *
 * @author Generator Productions
 * @version 1.0
 */
public class Onion extends Veggie
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Flop";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 9;
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "On";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Off";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Onion";
    }
}