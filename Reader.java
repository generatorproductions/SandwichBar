
/**
 * Write a description of class Reader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import SandyParts.*;

public class Reader
{
    private Menu m = new Menu();
    private Scanner s = new Scanner(System.in);
    public boolean readLine(Sandwich sandy)
    {
        String line = s.nextLine();
        String[] abrev = m.getAbrev();
        SandwichParts[] lParts = m.getParts();
        SandwichParts[] sParts = sandy.getParts();
        String comparer = "";
        for(SandwichParts s1 : sParts)
        {
            for(int i = 0; i < lParts.length; i++)
            {
                if(s1 == lParts[i])
                    comparer += abrev[i];
            }
        }
        
        return true;
    }
}
