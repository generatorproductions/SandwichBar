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
    String [][] goodResponses = {{"...", "Mayonnaise", "Yeet", "", "Yum", "Thank ya kiddo", "I wanna get back to work", "Nice calculation", "Thanks bud"},
                                 {"Constitutional", "I don't eat sandwiches", "*Whips*", "Thanks bro", "Get back to class", "I've arrived at Flavortown", "Wicked", "Epic", "", "Let's go", "Hehe, I don't know"},
                                 {"", "That's pretty good", "Oh yeah", "Thanks", "I suppose this sandwich is adequate", ""}}; 
    public String response();
    public String getName();
}
