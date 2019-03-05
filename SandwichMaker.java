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
    public static final String RES_NAMES[] = {"Grimmy Grab", "Krusty Karb", "Elong Must", "The Peppery Plantain", "Benni's Hut Sr.", "Chu Train & Shoe Crain", "Glovey Gapples"};
    private static Scanner s = new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("What difficulty do you want to play on? (easy/hard)");
        String diff = "";
        while(diff.equals(""))
        {
            String response = s.next();
            if(response.equalsIgnoreCase("hard"))
            {
                diff = "h";
            }
            else if(response.equalsIgnoreCase("easy"))
            {
                diff = "e";
            }
            else
            {
                System.out.println("Didn't quite get that. (easy/hard)");
            }
        }
        
        try{
            cc.clear();
        }catch(Exception e){}
        
        Menu m = new Menu(diff);
        SandwichList SLO = new SandwichList();
        CustomerList CLO = new CustomerList();
        
        
        
        System.out.println("Welcome to the "+ RES_NAMES[(int)(Math.random() * RES_NAMES.length)] +" new hire!");
        System.out.println("Please memorize the menu before the customers arrive.");
        
        m.printMenu();
        
        System.out.println("When you're ready type anything and press enter.");
        
        Grain g = new EverythingBagel();
        Protein p = new Chicken();
        Sauce s = new Hummus();
        Veggie v = new Pepper();
        Veggie l = new Lettuce();
        
        Sandwich sand1 = new Sandwich(g, p, s, v);
        Sandwich sand2 = new Sandwich(g, p, s, l);
        
        System.out.println(sand1.compare(sand1, sand2));
        System.out.println(sand1.addCalories());
        
    }
    
    public void run()
    {
        
    }
}
