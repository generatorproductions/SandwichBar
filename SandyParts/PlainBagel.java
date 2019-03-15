package SandyParts;

/**
 * Plain bagel
 *
 * @author Generator Productions
 * @version 1.0
 */
public class PlainBagel extends Bagel
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Thump";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 280;
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Pg";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Gp";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Plain Bagel";
    }
}
