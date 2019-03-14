/** 
 * Finds the name and response of the selected difficult customer.
 *
 * @author: Generator Productions
 * @version: 1.0
 */
public class DifficultCustomer implements Responses
{
    private String name = "Name";
    private int index = (int)(Math.random() * names[1].length);
    
    public DifficultCustomer()
    {
        name = names[2][index];
    }
    
    /**
     * @return: A String with the good response for the customer
     */
    public String goodResponse()
    {
        return goodResponses[2][index];
    }
    
    /**
     * @return: A String with the bad response for the customer
     */
    public String badResponse()
    {
        return badResponses[2][index];
    }
    
    /**
     * @return: A String that is the name of the customer
     */
    public String getName()
    {
        return name;
    }
}