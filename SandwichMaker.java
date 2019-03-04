/**
 * Write a description of class SandwichMaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SandwichMaker
{
    public static ConsoleClear cc = new ConsoleClear();
    public static final String RES_NAMES[] = {"Grimmy Grab", "Krusty Karb", "Elong Must", "R'p Gn'rat'or"};
    
    public static void main(String [] args)
    {
        Menu m = new Menu("h");
        SandwichList SLO = new SandwichList();
        CustomerList CLO = new CustomerList();
        
        
        
        System.out.println("Welcome to the "+ RES_NAMES[(int)(Math.random() * RES_NAMES.length)] +"!");
        System.out.println("Please memorize our menu. When you're ready type anything and press enter.");
        
        m.printMenu();
        
        
    }
    
    public void run()
    {
        
    }
}