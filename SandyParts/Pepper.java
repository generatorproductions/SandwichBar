package SandyParts;

/**
 * Pepper
 *
 * @author Generator Productions
 * @version 1.0
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
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Pe";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Ht";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Pepper";
    }
}