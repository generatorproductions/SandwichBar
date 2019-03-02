
/**
 * Write a description of class DifficultCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DifficultCustomer implements Customer
{
    private String name = "Name";
    public DifficultCustomer()
    {
        name = names[2][(int)(Math.random() * names.length)];
    }
    public String response()
    {
        return "";
    }
    public int rate()
    {
        return 0;
    }
    public Sandwich order()
    {
        return null;
    }
    public String getName()
    {
        return name;
    }
}
