
/**
 * Write a description of class EasyCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EasyCustomer implements Customer
{
    private String name = "Name";
    private int index = (int)(Math.random() * names[1].length);
    public EasyCustomer()
    {
        name = names[0][index];
    }
    public String goodResponse()
    {
        return goodResponses[0][index];
    }
    public String badResponse()
    {
        return badResponses[0][index];
    }
    public String getName()
    {
        return name;
    }
    
}
