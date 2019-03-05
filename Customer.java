/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Customer
{
    String[][] names = {{"Cole", "Gage", "Myla", "Kevin", "Sonny","Granny", "Officer Parish", "Gilbert 'Ratio' Reyes", "Paul Blart"},/* Easy */
                        {"Mr. Gibbs", "Angelo", "Hunter", "Jordan", "Mrs. Puff", "Guy Fieri", "Perch Perkins", "MatPat", "MC Steve", "Dan Gheesling", "ZywOo"},/* Mid */
                        {"Mr. Klug", "Mr. Faix", "Jablinski", "Mr. Joyce", "Bubble Bass", "Gene Scallop", "Stu Cabe", "Mrs. Obama", "Tory Christensen"}};/* Difficult */
    public String response();
    public int rate();
    public Sandwich order();
    public String getName();
}
