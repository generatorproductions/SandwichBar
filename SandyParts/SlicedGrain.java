package SandyParts;

/**
 * Slide grain bread
 *
 * @author Generator Productions
 * @version 1.0
 */
public class SlicedGrain extends Sliced
{
    
    public SlicedGrain()
    {
        super();
    }
    
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Schwhap";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 69+ super.getCalories();
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Sr";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "Ic";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Sliced Grain" + super.toString();
    }
}