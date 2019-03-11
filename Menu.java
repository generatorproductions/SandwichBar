
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import SandyParts.*;

public class Menu
{
    
    private static String[] easyOptions = {"Rb", "Sb", "Sr", "Sh", "Pg", "Ev", "Lt", "Cb", "On","Pe", "Be", "Tk", "Ci","Tf", "Md", "Ma", "Hs", "Mm"};
    private static String[] hardOptions = {"Sb", "Sr", "Sh", "Pg", "Ev", "Lt", "Cb", "On","Pe", "Be", "Tk", "Ci","Tf", "Md", "Ma", "Hs","Mm", "Rb"};
    private static SandwichParts[] parts = {new RegularBun(),new SeededBun(),new SlicedGrain(),new SlicedWhite(),new PlainBagel(),new EverythingBagel(),new Lettuce(),new Cucumber(),new Onion(),new Pepper(),new Beef(),new Turkey(), new Chicken(),new Tofu(), new Mustard(), new Mayonnaise(), new HotSauce(),new Hummus()};
    private static String menuString = "";
    private static String difficulty = "";
    public Menu()
    {
    
    }
    
    public Menu(String diff)
    {
        
        int i = 0;
        if(diff.equals("e") || diff.equalsIgnoreCase("easy"))
        {
            difficulty = "easy";
            menuString += "\n";
            for(String s : easyOptions)
            {
                menuString += parts[i] + "- " + s + "\t\t";
                i++;
                if(i % 3 == 0)
                {
                    menuString += "\n";
                }
            }
            menuString += "\n";
        }
        else if(diff.equals("h") || diff.equalsIgnoreCase("hard"))
        {
            difficulty = "hard";
            menuString += "\n";
            for(String s : hardOptions)
            {
                menuString += parts[i] + "- " + s + "\t\t";
                i++;
                if(i % 3 == 0)
                {
                    menuString += "\n";
                }
            }
            menuString += "\n";
        }
    }
    
    public String[] getAbrev()
    {
       if(difficulty.equals("easy"))
            return easyOptions;
       else if(difficulty.equals("hard"))
            return hardOptions;
            return easyOptions;
    }
    
    public SandwichParts[] getParts()
    {
        return parts;
    }
    
    public void printMenu()
    {
        System.out.print(menuString);
    }
    
    
}
