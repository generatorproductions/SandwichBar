/**
 * Write a description of class SandwichMaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import SandyParts.*;
public class SandwichMaker
{
    public static ArrayList<SandwichParts> grain = new ArrayList<SandwichParts>();
    public static ArrayList<SandwichParts> veggie = new ArrayList<SandwichParts>();
    public static ArrayList<SandwichParts> protein = new ArrayList<SandwichParts>();
    public static ArrayList<SandwichParts> sauce = new ArrayList<SandwichParts>();
    public static ConsoleClear cc = new ConsoleClear();
    public static final String RES_NAMES[] = {"Grimmy Grab", "Krusty Karb", "Elong Must", "The Peppery Plantain", "Benni's Hut Sr.", "Chu Train & Shoe Crain", "Glovey Gapples"};
    private static Scanner s = new Scanner(System.in);
    public static void main(String [] args)
    {
        arrayListMakers();
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
        
        
        System.out.println("Welcome to the "+ RES_NAMES[(int)(Math.random() * RES_NAMES.length)] +" new hire!");
        System.out.println("Please memorize the menu before the customers arrive.");
        
        m.printMenu();
        
        System.out.println("When you're ready type anything and press enter.");
        /*
        Sandwich sand1 = new Sandwich(g, p, s, v);
        Sandwich sand2 = new Sandwich(g, p, s, l);
        System.out.println(sand1.compare(sand1, sand2));
        System.out.println(sand1.addCalories());
        System.out.println(p.getTotalParts());
        */
       
       
    }
    
    public static void arrayListMakers()
    {
        grain.add(new EverythingBagel());
        grain.add(new PlainBagel());
        grain.add(new SlicedGrain());
        grain.add(new SlicedWhite());
        grain.add(new SeededBun());
        grain.add(new RegularBun());
        
        veggie.add(new Pepper());
        veggie.add(new Lettuce());
        veggie.add(new Onion());
        veggie.add(new Cucumber());
        
        sauce.add(new Hummus());
        sauce.add(new Mustard());
        sauce.add(new Mayonnaise());
        sauce.add(new HotSauce());
        
        protein.add(new Chicken());
        protein.add(new Turkey());
        protein.add(new Tofu());
        protein.add(new Beef());
    }
}
