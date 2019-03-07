/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Customer
{
    String[][] names = {{"Cole", "Gage", "Myla", "Kevin", "Sonny", "Granny", "Arnold", "Paul Blart", "Stoop Kid", "Tory Christensen"}, /* Easy */
                        {"Mr. Gibbs", "Angelo", "Hunter", "Jordan", "Mrs. Puff", "Guy Fieri", "Perch Perkins", "MatPat", "Dan Gheesling", "ZywOo"}, /* Mid */
                        {"Mr. Klug", "Mr. Faix", "Jablinski", "Mr. Joyce", "Bubble Bass", "Gene Scallop", "Stu Cabe", "Mrs. Obama", "Gordon Ramsay", "Gerald"}}; /* Difficult */
    String [][] goodResponses = {{"*Smiles*", "Mayonnaise.", "Yeet.", "Mmmmm.", "Yum.", "Thank ya, kiddo!", "Great, thanks!", "Thanks, bud.", "Glad I left my stoop for this!", "*High five*"},/* Easy */
                                 {"Fantastic.", "I don't eat sandwiches, but okay.", "Good stuff.", "Thanks, bro.", "Scrumptious!", "I've arrived at Flavortown.", "Wicked!", "Epic!", "Let's go!", "Hehe, I don't know (Good)."}, /* Mid */
                                 {"[INSERT RESPONSE]", "That's pretty good.", "Oh yeah!", "Thanks.", "I suppose this sandwich is adequate.", "Phenomenal.", "Alright!", "That's one mighty fine sandwich!", "I guess this is alright for a dump like this.", "Far out!"}}; /* Difficult */
    public String response();
    public String getName();
}