
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Menu
{
    
    private String[] easyOptions = {"Rb", "Sb", "Sr", "Sh", "Pg", "Ev", "Lt", "Cb", "On","Pe", "Be", "Tk", "Ci","Tf", "Md", "Ma", "Hs", "Mm"};
    private String[] hardOptions = {"Sb", "Sr", "Sh", "Pg", "Ev", "Lt", "Cb", "On","Pe", "Be", "Tk", "Ci","Tf", "Md", "Ma", "Hs","Mm", "Rb"};
    private String[] parts = {"RegularBun","SeededBun","SlicedGrain","SlicedWhite","PlainBagel","EverythingBagel","Lettuce","Cucumber","Onion","Pepper","Beef","Turkey", "Chicken","Tofu", "Mustard", "Mayo", "Hot Sause","Hummus"};
    private String menuString = "";
    private String difficulty = "";
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
    
    public String[][] getValues()
    {
        String[][] result = new String[2][parts.length];
        if(difficulty.equals("easy"))
        {
            result[0] = easyOptions;
            result[1] = parts;
        }
        if(difficulty.equals("hard"))
        {
            result[0] = hardOptions;
            result[1] = parts;
        }
        return result;
    }
    
    public void printMenu()
    {
        System.out.print(menuString);
    }
    
    
}
