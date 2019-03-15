package SandyParts;

/**
 * Turkey
 *
 * @author Generator Productions
 * @version 1.0
 */
public class Turkey extends Protein
{
    public Turkey()
    {
        super();
    }
    
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Splat";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 54;
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Tk";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Ky";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Turkey";
    }
}