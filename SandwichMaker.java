/**
 * Write a description of class SandwichMaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SandwichMaker
{
    public static ConsoleClear cc = new ConsoleClear();
    
    public static void main(String [] args)
    {
        Menu m = new Menu();
        SandwichList SLO = new SandwichList();
        CustomerList CLO = new CustomerList();
        Customer c1 = new EasyCustomer();
        System.out.println(c1.getName());
        Customer c2 = new MidCustomer();
        System.out.println(c2.getName());
        Customer c3 = new DifficultCustomer();
        System.out.println(c3.getName());
        m.printMenu();
        
        
    }
    
    public void run()
    {
        boolean on = true;
        while(on == true)
        {
            
        }
    }
}