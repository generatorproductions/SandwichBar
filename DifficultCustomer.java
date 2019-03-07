
/**
 * Write a description of class DifficultCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DifficultCustomer implements Customer
{
    private String name = "Name";
    private int index = (int)(Math.random() * names[1].length);
    public DifficultCustomer()
    {
        name = names[2][index];
    }
    public String goodResponse()
    {
        return goodResponses[2][index];
    }
    public String badResponse()
    {
        return badResponses[2][index];
    }
    public String getName()
    {
        return name;
    }
}
