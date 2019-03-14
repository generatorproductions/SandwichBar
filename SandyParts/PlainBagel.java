package SandyParts;

/**
 * Write a description of class PlainBagel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlainBagel extends Bagel
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Thump";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 280;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Plain Bagel";
    }
}
