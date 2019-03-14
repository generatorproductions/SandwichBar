/**
 * Clears Console
 *
 * @author Generator Productions
 * @version 1.0
 */
import java.io.IOException;

public class ConsoleClear
{
    /**
     * To use this clear method you need to surround it in a try catch as so
     * try{
            cc.clear();
        }catch(Exception e){}
     */
    public void clear(String... arg) throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}