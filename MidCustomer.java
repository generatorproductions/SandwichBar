
/**
 * Write a description of class MidCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MidCustomer implements Customer
{
    private String name = "Name";
    public MidCustomer()
    {
        name = names[1][(int)(Math.random() * names[1].length)];
    }
    public String response()
    {
        return "";
    }
    
    public String getName()
    {
        return name;
    }
}
