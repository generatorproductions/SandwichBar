/**
 * Write a description of class SandwichMaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class SandwichMaker
{
    public static ConsoleClear cc = new ConsoleClear();
    public static final String RES_NAMES[] = {"Grimmy Grab", "Krusty Karb", "Elong Must", "Rap Genny"};
    private static Scanner s = new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("What difficulty do you want to play on?(easy/hard)");
        String diff = "";
        if(s.next().indexOf("h") != -1)
        {
            diff = "h";
        }
        else
        {
            diff = "e";
        }
        
        
        Menu m = new Menu(diff);
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