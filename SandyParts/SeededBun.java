package SandyParts;

/**
 * Write a description of class SeededBun here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     * @return: A string of the food name
     */
    public String toString()
    {
        return "Seeded Bun";
    }
}