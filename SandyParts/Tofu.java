package SandyParts;

/**
 * Tofu
 *
 * @author Generator Productions
 * @version 1.0
 */
public class Tofu extends Protein
{
    public Tofu()
    {
        super();
    }
    
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Glop";
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
        return "Tf";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Bd";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Tofu";
    }
}
