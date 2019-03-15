package SandyParts;


/**
 * Beef
 *
 * @author Generator Productions
 * @version 1.0
 */
public class Bacon extends Protein
{
    public Bacon()
    {
        super();
    }
    
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Cruncl";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 548;
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Ba";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Dd";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Bacon";
    }
}