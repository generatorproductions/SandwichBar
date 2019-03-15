package SandyParts;

/**
 * Seeded bun
 *
 * @author Generator Productions
 * @version 1.0
 */
public class SeededBun extends Bun
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Tatter";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 120;
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on easy mode
     */
    public String getEasyAbrev()
    {
        return "Sb";
    }
    
    /**
     * @return: A String that represents the abbreviations for the word on hard mode
     */
    public String getHardAbrev()
    {
        return "De";
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Seeded Bun";
    }
}