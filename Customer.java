/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Customer
{
    String[][] names = {{"Cole", "Gage", "Myla", "Kevin", "Sonny","Granny"},/* Easy */
                        {"Gibbs", "Angelo", "Hunter", "Jordan","Mrs.Puff", "Guy Fieri's Wife"},/* Mid */
                        {"Mr. Klug", "Mr. Faix", "Jablinski", "Mr. Joyce", "Bubble Bass", "Gene Scallop","Mrs. Obama", "Madame Hagfish"}};/* Difficult */
    public String response();
    public int rate();
    public Sandwich order();
    public String getName();
}
