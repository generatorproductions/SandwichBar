package SandyParts;

/**
 * Hummus
 *
 * @author Generator Productions
 * @version 1.0
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
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Hm";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Yh";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Hummus";
    }
}