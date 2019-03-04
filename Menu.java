
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Menu
{
    
    private String[] options = {"Rb", "Sb", "Sg", "Sw", "Pg", "Eb", "Le", "Cu", "Ka", "Be", "Tu", "Ch"};
    private String[] parts = {"RegularBun","SeededBun","SlicedGrain","SlicedWhite","PlainBagel","EverythingBagel","Lettuce","Cucumber","Kale","Beef","Turkey", "Chicken"};
    public Menu()
    {
        
    }
    
    public void printMenu()
    {
        int i = 0;
        for(String s : options)
        {
            System.out.print(parts[i] + "- " + s + "\t\t");
            i++;
            if(i % 3 == 0)
            {
                System.out.println();
            }
        }
    }
}
