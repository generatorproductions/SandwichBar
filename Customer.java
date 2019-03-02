/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Customer
{
    String[][] names = {{"Cole", "Gage", "Mila", "Kevin", "Sonny"},/* Easy */
                        {"Gibbs", "Angelo", "Hunter", "Jordan"},/* Mid */
                        {"Klugg", "Faix", "Jablinski", "Joyce"}};/* Difficult */
    public String response();
    public int rate();
    public Sandwich order();
    public String getName();
}