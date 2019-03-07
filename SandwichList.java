/**
 * Write a description of class SandwitchList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class SandwichList
{
    ArrayList<Sandwich> menu = new ArrayList<Sandwich>();
    public void add(Sandwich s)
    {
        if(menu.size() <= 3)
        {
            menu.add(s);
            System.out.println("Sanwich " + s + " added to the menu in slot " + menu.size());
        }
        else
        {
            System.out.println("Menu is full!");
        }
    }
}