package SandyParts;

/**
 * Write a description of class Tofu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tofu extends Protein
{
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
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Tofu";
    }
}
