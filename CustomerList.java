/**
 * Write a description of class CustomerList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class CustomerList
{
    private ArrayList<Customer> types = new ArrayList<Customer>();
    public void add(Customer c)
    {
        if(types.size() <= 10)
        {
            types.add(c);
            System.out.println("Customer " + c + " is in line");
        }
        else
        {
            System.out.println("Line is full!");
        }
    }
}