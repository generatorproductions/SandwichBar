
/**
 * Write a description of class MidCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MidCustomer implements Customer
{
    private String name = "Name";
    private int index = (int)(Math.random() * names[1].length);
    public MidCustomer()
    {
        name = names[1][index];
    }
    public String goodResponse()
    {
        return goodResponses[1][index];
    }
    public String badResponse()
    {
        return badResponses[1][index];
    }
    public String getName()
    {
        return name;
    }
}
