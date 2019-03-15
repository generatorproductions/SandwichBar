package SandyParts;

/**
 * 
 *
 * @author Generator Productions
 * @version 1.0
 */
abstract public class Veggie extends SandwichParts
{
    private static VeggieList list = new VeggieList();
    
    public Veggie()
    {
        super();
        list.add(this);
    }
    /*
     * @return: Calorie count of veggies
     */
    abstract public int getCalories();
}