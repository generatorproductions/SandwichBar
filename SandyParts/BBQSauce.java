package SandyParts;


/**
 * BBQ Sauce
 *
 * @author Generator Productions
 * @version 1.0
 */
public class BBQSauce extends Sauce
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Crackle";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 53;
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Bb";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Tx";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "BBQ Sauce";
    }
}