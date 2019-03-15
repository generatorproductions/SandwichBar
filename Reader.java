/**
 * The Reader class reads an input from the user and compares it to a sandwich.
 *
 * @author: Generator Productions
 * @version: 1.0
 */
import java.util.*;
import SandyParts.*;

public class Reader
{
    private Menu m = new Menu();
    private Scanner s = new Scanner(System.in);
    private PartsList l = new PartsList();
    /**
     * Asks the user for input and uses that input to compare to a sandwich
     * if the input and the sandwich are the same returns true
     * else returns false;
     */
    public boolean readLine(Sandwich sandy)
    {
        
        String line = s.nextLine();
        ArrayList<String> abrev;
        if(m.getDifficulty().equals("hard"))
        {
            abrev = l.getHardAbbrev();
        }
        else
        {
            abrev = l.getEasyAbbrev();
        }
        ArrayList<SandwichParts> lParts = l.getParts();
        SandwichParts[] sParts = sandy.getParts();
        String comparer = "";
        boolean result = true;
        for(SandwichParts s1 : sParts)
        {
            for(int i = 0; i < lParts.size(); i++)
            {
                if(s1.toString().equals( lParts.get(i).toString()))
                {
                    comparer += abrev.get(i);
                    
                    if(line.indexOf(abrev.get(i)) == -1)
                    {
                        result = false;
                    }
                    else
                    {
                        System.out.print(s1.noise() + " ");
                    }
                    
                }
            }
        }
        
        if(comparer.length() != line.length())
        {
            result = false;
        }
        
        System.out.println();
        return result;
    }
}
