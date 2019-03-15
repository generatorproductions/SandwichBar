/** 
 * Finds the name and response of the selected easy customer.
 *
 * @author: Generator Productions
 * @version: 1.0
 */
public class EasyCustomer implements Responses
{
    private String name = "Name";
    private int index = (int)(Math.random() * names[1].length);
    
    public EasyCustomer()
    {
        name = names[0][index];
    }
    
    /**
     * Gets a good response
     * @return: A String with the good response for the customer
     */
    public String goodResponse()
    {
        return goodResponses[0][index];
    }
    
    /**
     * Gets a bad response
     * @return: A String with the bad response for the customer
     */
    public String badResponse()
    {
        return badResponses[0][index];
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
