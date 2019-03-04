
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Menu
{
    
    private String[] easyOptions = {"Rb", "Sb", "Sr", "Sh", "Pg", "Ev", "Lt", "Cb", "Ka", "Be", "Tk", "Ci", "Md", "Ma", "Hs"};
    private String[] hardOptions = {"Sb", "Sr", "Sh", "Pg", "Ev", "Lt", "Cb", "Ka", "Be", "Tk", "Ci", "Md", "Ma", "Hs", "Rb"};
    private String[] parts = {"RegularBun","SeededBun","SlicedGrain","SlicedWhite","PlainBagel","EverythingBagel","Lettuce","Cucumber","Kale","Beef","Turkey", "Chicken", "Mustard", "Mayo", "Hot Sause"};
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
