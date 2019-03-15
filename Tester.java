
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import SandyParts.*;
public class Tester
{
    
    public static void main(String [] args)
    {
        
        new EverythingBagel();
        new PlainBagel();
        new SlicedGrain();
        new SlicedWhite();
        new SeededBun();
        new RegularBun();
        
        new Pepper();
        new Lettuce();
        new Onion();
        new Cucumber();
        
        new Hummus();
        new Mustard();
        new Mayonnaise();
        new HotSauce();
        
        new Chicken();
        new Turkey();
        new Tofu();
        new Beef();
        
        
        GrainList g = new GrainList();
        ProteinList p = new ProteinList();
        PartsList l = new PartsList();
        
        
        System.out.println(l.getList());
        System.out.println(l.getEasyAbbrev());
        System.out.println(l.getHardAbbrev());
    }
}
