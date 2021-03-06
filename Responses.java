/**
 * An interface that provides String[][]'s for classes that implement Responses.
 *
 * @author: Generator Productions
 * @version: 1.0
 */
public interface Responses
{
    String[][] names = {{"Cole", "Gage", "Myla", "Kevin", "Sonny", "Granny", "Arnold", "Paul Blart", "Stoop Kid", "Tory Christensen"}, /* Easy */
                        {"Mr. Gibbs", "Angelo", "Hunter", "Jordan", "Mrs. Puff", "Guy Fieri", "Perch Perkins", "MatPat", "Dan Gheesling", "ZywOo"}, /* Mid */
                        {"Mr. Klug", "Mr. Faix", "Jablinski", "Mr. Joyce", "Bubble Bass", "Gene Scallop", "Stu Cabe", "Mrs. Obama", "Gordon Ramsay", "Gerald"}}; /* Difficult */
    String [][] goodResponses = {{"*Smiles*", "Yee.", "Yeet.", "Mmmmm.", "Yum.", "Thank ya, kiddo!", "Great, thanks!", "Thanks, bud.", "Glad I left my stoop for this!", "*High five*"},/* Easy */
                                 {"Constitutional.", "I don't eat sandwiches, but okay.", "I like that.", "That's it, chief.", "Scrumptious!", "I've arrived at Flavortown.", "Wicked!", "Epic!", "Let's go!", "Hehe, I don't know (Good)."}, /* Mid */
                                 {"That is fantabulous", "That's pretty good.", "Oh yeah!", "Thanks.", "I suppose this sandwich is adequate.", "Phenomenal.", "Alright!", "That's one mighty fine sandwich!", "I guess this is alright for a dump like this.", "Far out!"}}; //difficult
    String [][] badResponses = {{"...", "Wot.", "Reeee!", "Oh god, this is disgusting.", "Eww.", "Do better next time, kiddo.", "Good try.", "This is gross.", "I shouldn't have left my stoop for this...", "*Unenthusiastic high-five*"}, 
                                {"I'm not your bro.", "I don't like sandwiches anyway.", "Nah, that ain't for me.", "That ain't it, chief.", "Go back to school.", "No, dawg.", "I'd rather go to the Chum Bucket.", "Yuck.", "You'll get em next time.", "Hehe, I don't know (bad)."},
                                {"The person who made this is nucking futs.", "This isn't good.", "You failed me... just like my El Gato.", "Okay, I'm done for today.", "You forgot the pickles.", "*Walks out the door*", "Was this made by a little elephant?", "Sweet potatoes! This is a bad sandwich.", "What is this. It is dryyyy!", "This is trash."}};
    /**
     * @return: The customer's good response.
     */
    public String goodResponse();
    /**
     * @return: The customer's bad response.
     */
    public String badResponse();
    /**
     * @return: The customer's name.
     */
    public String getName();
}
