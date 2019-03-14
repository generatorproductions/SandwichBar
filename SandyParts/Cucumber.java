package SandyParts;

/**
 * Write a description of class Cucumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cucumber extends Veggie
{
     /**
     * @return: A string of the sound the food makes
     */
    public String noise()
    {
        return "Blub";
    }
    
    /**
     * @return: A numerical value of the calorie count of the food
     */
    public int getCalories()
    {
        return 3;
    }
    
    /**
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Cucumber";
    }
}