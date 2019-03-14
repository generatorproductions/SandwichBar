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
    public static final String RES_NAMES[] = {"Grimmy Grab", "Krusty Karb", "Elong Must", "The Peppery Plantain", "Benni's Hut Sr.", "Chu Train & Shoe Crain", "Glovey Gapples", "Kalamari Canteen", "Bell's Kitchen", "Chokey Chicken", "Bouta Burger", "Whippin' Weasel","Finna Freash","The Whipped Dream"};
    private static Scanner scanner = new Scanner(System.in);
    private static Reader r = new Reader();
    /**
     * Main method
     */
    public static void main(String [] args)
    {
        int score = 0;
        arrayListMakers();
        System.out.println("What difficulty do you want to play on? (easy/hard)");
        String diff = "";
        while(diff.equals(""))
        {
            String response = scanner.nextLine();
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
        String secret = scanner.next().trim();
        if(secret.equalsIgnoreCase("where'sthekale?"))
        {
            System.out.println("RIP Kale");
            System.out.println("Type anything to proceed.");
            scanner.next();
        }
        else if(secret.equalsIgnoreCase("where'stheyeehaw?"))
        {
            System.out.println("RIP Yee Haw");
            System.out.println("Type anything to proceed.");
            scanner.next();
        }
        try{
            cc.clear();
        }catch(Exception e){}
        
        for(int i = 0; i < 10; i++)
        {
            Responses c;
            Sandwich s;
            int rand = (int)(Math.random() * 3);
            if(rand == 0)
            {
                c = new EasyCustomer();
                s = createEasySandy();
            }
            else if(rand == 1)
            {
                c = new MidCustomer();
                s = createMidSandy();
            }
            else
            {
                c = new DifficultCustomer();
                s = createDiffSandy();
            }
            System.out.println(c.getName() + ": I'd like a " + s + ".");
            if(r.readLine(s))
            {
                System.out.println(c.getName() + ": " + c.goodResponse());
                score++;
            }
            else
            {
                System.out.println(c.getName() + ": " + c.badResponse());
            }
            System.out.println("Type anything to proceed.");
            scanner.next();
            try{
                cc.clear();
            }catch(Exception e){}
        }
        if(score >= 10)
            System.out.println("Well done! You got score of 10/10!");
        else if(score >= 7)
            System.out.println("Not Bad! You got a score of " + score + "/10");
        else 
            System.out.println("You're Fired! You got a score of " + score + "/10");
        
    }
    
    /**
     * @return: Contructs the arraylists for grains, veggies, sauce, and proteins
     */
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
    
    /**
     * @return: A sandwich object with 1 grain, 1 protein, 1 veggie, and 1 sauce
     */
    public static Sandwich createEasySandy()
    {
        Grain g = grain.get((int)(Math.random() * grain.size()));
        Veggie v = veggie.get((int)(Math.random() * veggie.size()));
        Protein p = protein.get((int)(Math.random() * protein.size()));
        Sauce s = sauce.get((int)(Math.random() * sauce.size()));
        Sandwich sandy = new Sandwich(g, p, s, v);
        return sandy;
    }
    
    /**
     * @return: A sandwich object with 1 grain, 1 protein, 2 veggie, and 1 sauce
     */
    public static Sandwich createMidSandy()
    {
        Grain g = grain.get((int)(Math.random() * grain.size()));
        Veggie v = veggie.get((int)(Math.random() * veggie.size()));
        Veggie v2 = veggie.get((int)(Math.random() * veggie.size()));
        while(v == v2)
        {
            v2 = veggie.get((int)(Math.random() * veggie.size()));
        }
        Protein p = protein.get((int)(Math.random() * protein.size()));
        Sauce s = sauce.get((int)(Math.random() * sauce.size()));
        Sandwich sandy = new Sandwich(g, p, s, v, v2);
        return sandy;
    }
    
    /**
     * @return: A sandwich object with 1 grain, 1 protein, 2 veggie, and 2 sauce
     */
    public static Sandwich createDiffSandy()
    {
        Grain g = grain.get((int)(Math.random() * grain.size()));
        Veggie v = veggie.get((int)(Math.random() * veggie.size()));
        Veggie v2 = veggie.get((int)(Math.random() * veggie.size()));
        while(v == v2)
        {
            v2 = veggie.get((int)(Math.random() * veggie.size()));
        }
        Protein p = protein.get((int)(Math.random() * protein.size()));
        Sauce s = sauce.get((int)(Math.random() * sauce.size()));
        Sauce s1 = sauce.get((int)(Math.random() * sauce.size()));
        while(s == s1)
        {
            s1 = sauce.get((int)(Math.random() * sauce.size()));
        }
        Sandwich sandy = new Sandwich(g, p, s, s1, v, v2);
        return sandy;
    }
}