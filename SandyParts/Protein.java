package SandyParts;

/**
 * Write a description of class Protein here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract public class Protein extends SandwichParts
{
    private static ProteinList list = new ProteinList();
    
    public Protein()
    {
        super();
        list.add(this);
    }
    
    /*
     * @return: Calorie count of protein
     */
    abstract public int getCalories();
}