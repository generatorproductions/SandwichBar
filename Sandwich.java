/**
 * Puts the sandwich together
 *
 * @author: Generator Productions
 * @version: 1.0
 */
import SandyParts.*;

public class Sandwich
{
    SandwichParts g, p, s1, s2, v1, v2;
    private static int sandwichMade = 0;
    
    /**
     * Makes a sandwich with all parts
     */
    public Sandwich(Grain p1, Protein p2, Sauce p3, Sauce p4, Veggie p5, Veggie p6)
    {
        g = p1;
        p = p2;
        s1 = p3;
        s2 = p4;
        v1 = p5;
        v2 = p6;
        sandwichMade++;
    }
    
    /**
     * Makes a sandwich with 2 sauces and 1 veggie
     */
    public Sandwich(Grain p1, Protein p2, Sauce p3, Sauce p4, Veggie p5)
    {
        g = p1;
        p = p2;
        s1 = p3;
        s2 = p4;
        v1 = p5;
        sandwichMade++;
    }
    
    /**
     * Makes a sandwich with 1 sauce and 2 veggies
     */
    public Sandwich(Grain p1, Protein p2, Sauce p3, Veggie p5, Veggie p6)
    {
        g = p1;
        p = p2;
        s1 = p3;
        v1 = p5;
        v2 = p6;
        sandwichMade++;
    }
    
    /**
     * Makes a sandwich with 1 sauce and 1 veggie
     */
    public Sandwich(Grain p1, Protein p2, Sauce p3, Veggie p5)
    {
        g = p1;
        p = p2;
        s1 = p3;
        v1 = p5;
        sandwichMade++;
    }
    
    /**
     * Compares two sandwiches
     * @return: True if 2 sandwiches are identical
     * false otherwise
     */
    public boolean compare(Sandwich sand1, Sandwich sand2)
    {
        if(sand1.g == sand2.g && sand1.p == sand2.p && sand1.s1 == sand2.s1 &&sand1.s2 == sand2.s2 &&sand1.v1 == sand2.v1 &&sand1.v2 == sand2.v2)
            return true;
        else 
            return false;
    }
    
    /**
     * Adds calories of sandwich parts
     * @return: A numerical value of the total calories of all parts of the sandwich
     */
    public int addCalories()
    {
        int total = g.getCalories() + p.getCalories() + s1.getCalories()  + v1.getCalories() ;
        try{
            total += s2.getCalories();
        }catch(Exception e){}
        try{
            total += v2.getCalories();
        }catch(Exception e){}
        return total;
    }
    
    /**
     * Gets the number of parts in the sandwich
     * @return: The amount of parts in the sandwich
     */
    public int getTotalMade()
    {
        return sandwichMade;
    }
    
    /**
     * Resets the counter to 0
     */
    public void resetTotalMade()
    {
        sandwichMade = 0;
    }
    
    /**
     * The sandwich array
     * @return: An array of the sandwich parts that make up the sandwich
     */
    public SandwichParts[] getParts()
    {
        if(v2 != null && s2 != null)
        {
           return  new SandwichParts[]{g,p,v1,v2,s1,s2};
        }
        else if(v2 != null && s2 == null)
            return  new SandwichParts[]{g,p,v1,v2, s1};
        else
            return  new SandwichParts[]{g,p,v1,s1};
    }
    
    /**
     * Puts the responses together
     * @return: Sentences that the customers say when ordering a sandwich
     */
    public String toString()
    {
        String result = "";
        result += g + " with " + p + ", " + v1 + ", ";
        if(v2 != null && s2 != null)
            result += v2 + ", " + s1 + ", and " + s2;
        else if(v2 != null && s2 == null)
            result += v2 + ", and " + s1;
        else
            result += "and " + s1;
        return result;
    }
}
