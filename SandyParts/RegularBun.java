package SandyParts;

/**
 * Regular bun
 *
 * @author Generator Productions
 * @version 1.0
 */
public class RegularBun extends Bun
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Plop";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 84+ super.getCalories();
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Rb";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Gn";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Regular" + super.toString();
    }
    
}