/**
 * Write a description of class Sandwich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sandwich
{
    SandwichParts g, p, s1, s2, v1, v2;
    
    
    
    
    public Sandwich(Grain p1, Protein p2, Sauce p3, Sauce p4, Veggie p5, Veggie p6)
    {
        g = p1;
        p = p2;
        s1 = p3;
        s2 = p4;
        v1 = p5;
        v2 = p6;
    }
    
    public Sandwich(Grain p1, Protein p2, Sauce p3, Sauce p4, Veggie p5)
    {
        g = p1;
        p = p2;
        s1 = p3;
        s2 = p4;
        v1 = p5;
    }
    
    public Sandwich(Grain p1, Protein p2, Sauce p3, Veggie p5, Veggie p6)
    {
        g = p1;
        p = p2;
        s1 = p3;
        v1 = p5;
        v2 = p6;
    }
    
    public Sandwich(Grain p1, Protein p2, Sauce p3, Veggie p5)
    {
        g = p1;
        p = p2;
        s1 = p3;
        v1 = p5;
    }
    
    public boolean compare(Sandwich sand1, Sandwich sand2)
    {
        if(sand1.g == sand2.g && sand1.p == sand2.p && sand1.s1 == sand2.s1 &&sand1.s2 == sand2.s2 &&sand1.v1 == sand2.v1 &&sand1.v2 == sand2.v2)
            return true;
        else 
            return false;
    }
    
    
    
}