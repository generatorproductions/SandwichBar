package SandyParts;

/**
 * Lettuce
 *
 * @author Generator Productions
 * @version 1.0
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
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Lt";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Wa";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Lettuce";
    }
}