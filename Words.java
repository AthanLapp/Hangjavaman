import java.util.ArrayList;
import java.util.Random;
/**
 * Provides static method for choosing randomly a word from a dictionary
 * 
 * @author (CR) 
 * @version (11/2012)
 */
public class Words
{
   //class variables
   private static ArrayList<String> dictionary=new ArrayList<String>();
   private static Random random=new Random();
   
   /*
    * Generates a list of words
    */
   private static void generateWords()
   {
       String[] words={"ALCOHOL","AMBULANCE","ANSWER", "AUDIENCE", "AUTOMN", 
           "BLANKET", "BRIDGE",
           "CARPENTER", "CHICKEN", "COMFORTABLE", "COMPUTER", "CONFIDENCE", "COUNTRY",
           "DANGEROUS", "DAUGHTER", "DESCRIBE", "DIRECTLY", "DISTANCE",
           "EQUIPMENT", "EXAMPLE", "EXPERIMENT",
           "FAIRYTALE", "FISHERMAN", "GOVERNMENT",
           "IMAGINATION", "IMPORTANCE", "INDUSTRY", "INFLUENCE", "INSTRUMENT",
           "KEYHOLE", "KNOWLEDGE",
           "LANGUAGE", "MACHINE", "NATURAL", "ORDINARY",
           "PICTURE", "PLEASURE", "POPULATION", "POWERFUL", "QUESTION",
           "STRANGE", "SUBSTANCE", "SURFACE", "SURPRISE", "SYSTEM",
           "TEMPERATURE", "TRIANGLE",
           "UNKNOWN", "WORKER", "YOUTHFUL"};
       for(int i=0;i<words.length;i++)
        dictionary.add(words[i]);
   }//generateWords
   
   /**
    * Creates a list of words and picks one in random
    * 
    * @return the chosen word
    */
   public static String randomWord()
   {
       generateWords();
       return (String) dictionary.get(random.nextInt(dictionary.size()));
   }//randomWord
}//class
