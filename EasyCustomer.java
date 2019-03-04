
/**
 * Write a description of class EasyCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EasyCustomer implements Customer
{
    private String name = "Name";
    public EasyCustomer()
    {
        name = names[0][(int)(Math.random() * names[0].length)];
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
