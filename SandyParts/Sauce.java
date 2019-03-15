package SandyParts;

/**
 * Sauces
 *
 * @author Generator Productions
 * @version 1.0
 */
abstract public class Sauce extends SandwichParts
{
    private static SauceList list = new SauceList();
    
    public Sauce()
    {
        super();
        list.add(this);
    }
    /*
     * @return: Calorie count of sauces
     */
    abstract public int getCalories();
}