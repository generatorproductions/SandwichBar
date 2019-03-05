
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
    public Menu(String diff)
    {
        
        int i = 0;
        if(diff.equals("e"))
        {
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
        else if(diff.equals("h"))
        {
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
    
    public void printMenu()
    {
        
        System.out.print(menuString);
    }
    
    
}
