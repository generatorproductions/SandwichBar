package SandyParts;

/**
 * Beef
 *
 * @author Generator Productions
 * @version 1.0
 */
public class Beef extends Protein
{
    public Beef()
    {
        super();
    }
    
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Thunk";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 213;
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Be";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Rb";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Beef";
    }
}