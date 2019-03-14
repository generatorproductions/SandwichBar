package SandyParts;

/**
 * Write a description of class EverythingBagel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EverythingBagel extends Bagel
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Razzel";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 290;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Everything Bagel";
    }
}