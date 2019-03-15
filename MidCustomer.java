/** 
 * Finds the name and response of the selected medium customer.
 *
 * @author: Generator Productions
 * @version: 1.0
 */
public class MidCustomer implements Responses
{
    private String name = "Name";
    private int index = (int)(Math.random() * names[1].length);
    
    public MidCustomer()
    {
        name = names[1][index];
    }
    
    /**
     * Outputs a positive response
     * @return: A String with the good response for the customer
     */
    public String goodResponse()
    {
        return goodResponses[1][index];
    }
    
    /**
     * Outputs a negative response
     * @return: A String with the bad response for the customer
     */
    public String badResponse()
    {
        return badResponses[1][index];
    }
    
    /**
     * Gets the customer's name
     * @return: A String that is the name of the customer
     */
    public String getName()
    {
        return name;
    }
}
