package SandyParts;

/**
 * Sliced white bread
 *
 * @author Generator Productions
 * @version 1.0
 */
public class SlicedWhite extends Sliced
{
    public SlicedWhite()
    {
        super();
    }
    
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Schwhip";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 79+ super.getCalories();
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Sh";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Lc";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Sliced White" + super.toString();
    }
}