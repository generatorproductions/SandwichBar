package SandyParts;

/**
 * Mayonnaise
 *
 * @author Generator Productions
 * @version 1.0
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
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Ma";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Ni";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Mayonnaise";
    }
}