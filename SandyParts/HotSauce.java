package SandyParts;

/**
 * Hot Sauce
 *
 * @author Generator Productions
 * @version 1.0
 */
public class HotSauce extends Sauce
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Sizzle";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 0;
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Hs";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Sc";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Hot Sauce";
    }
}