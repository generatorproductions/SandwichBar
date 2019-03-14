package SandyParts;

/**
 * Write a description of class Chicken here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chicken extends Protein
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Thud";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 335;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Chicken";
    }
}