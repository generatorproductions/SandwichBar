/**
 * Write a description of class LineClear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.IOException;

public class ConsoleClear
{
    /*
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