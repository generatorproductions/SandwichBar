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
    public static ArrayList<Grain> grain = new ArrayList<Grain>();
    public static ArrayList<Veggie> veggie = new ArrayList<Veggie>();
    public static ArrayList<Protein> protein = new ArrayList<Protein>();
    public static ArrayList<Sauce> sauce = new ArrayList<Sauce>();
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
        
        System.out.println("When you're ready, type anything and press enter.");
        s.next();
        Customer easyC = new EasyCustomer();
        Customer midC = new MidCustomer();
        Customer diffC = new DifficultCustomer();
        System.out.println(easyC.getName() + ": can I get a " + createEasySandy());
        System.out.println(midC.getName() + ": can I get a " +createMidSandy());
        System.out.println(diffC.getName() + ": can I get a " +createDiffSandy());
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
    
    public static Sandwich createEasySandy()
    {
        Grain g = grain.get((int)(Math.random() * grain.size()));
        Veggie v = veggie.get((int)(Math.random() * veggie.size()));
        Protein p = protein.get((int)(Math.random() * protein.size()));
        Sauce s = sauce.get((int)(Math.random() * sauce.size()));
        Sandwich sandy = new Sandwich(g, p, s, v);
        return sandy;
    }
    public static Sandwich createMidSandy()
    {
        Grain g = grain.get((int)(Math.random() * grain.size()));
        Veggie v = veggie.get((int)(Math.random() * veggie.size()));
        Veggie v2 = veggie.get((int)(Math.random() * veggie.size()));
        Protein p = protein.get((int)(Math.random() * protein.size()));
        Sauce s = sauce.get((int)(Math.random() * sauce.size()));
        Sandwich sandy = new Sandwich(g, p, s, v, v2);
        return sandy;
    }
    public static Sandwich createDiffSandy()
    {
        Grain g = grain.get((int)(Math.random() * grain.size()));
        Veggie v = veggie.get((int)(Math.random() * veggie.size()));
        Veggie v2 = veggie.get((int)(Math.random() * veggie.size()));
        Protein p = protein.get((int)(Math.random() * protein.size()));
        Sauce s = sauce.get((int)(Math.random() * sauce.size()));
        Sauce s1 = sauce.get((int)(Math.random() * sauce.size()));
        Sandwich sandy = new Sandwich(g, p, s, s1, v, v2);
        return sandy;
    }
    
    
    
    
    
}
