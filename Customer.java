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
    String [][] goodResponses = {{"*Smiles*", "Yee.", "Yeet.", "Mmmmm.", "Yum.", "Thank ya, kiddo!", "Great, thanks!", "Thanks, bud.", "Glad I left my stoop for this!", "*High five*"},/* Easy */
                                 {"Constitutional.", "I don't eat sandwiches, but okay.", "I like that.", "That's it, chief.", "Scrumptious!", "I've arrived at Flavortown.", "Wicked!", "Epic!", "Let's go!", "Hehe, I don't know (Good)."}, /* Mid */
                                 {"That is fantabulous", "That's pretty good.", "Oh yeah!", "Thanks.", "I suppose this sandwich is adequate.", "Phenomenal.", "Alright!", "That's one mighty fine sandwich!", "I guess this is alright for a dump like this.", "Far out!"}}; //difficult
    String [][] badResponses = {{"...", "Wot.", "Reeee!", "[INSERT RESPONSE]", "Eww.", "Do better next time, kiddo.", "Good try.", "", "I shouldn't have left my stoop for this...", "*Unenthusiastic high-five*"}, 
                                {"I'm not your bro.", "I don't like sandwiches anyway.", "Nah, that ain't for me.", "That ain't it, chief.", "Go back to school.", "No, dawg.", "I'd rather go to the Chum Bucket.", "Yuck.", "You'll get em next time.", "Hehe, I don't know (bad)."},
                                {"The person who made this is nucking futs.", "[INSERT RESPONSE]", "You failed me... just like my El Gato.", "[INSERT RESPONSE]", "You forgot the pickles.", "*Walks out the door*", "Was this made by a little elephant?", "Sweet potatoes! This is a bad sandwich.", "What is this filth?", "This is trash."}};
    public String goodResponse();
    public String badResponse();
    public String getName();
}