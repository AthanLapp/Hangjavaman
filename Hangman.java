
/**
 * Write a description of class Hangman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Arrays;
public class Hangman
{
    // instance variables - replace the example below with your own
    private int RoundsLeft;
    private String HiddenWord;
    private int HiddenWordLength;
    private char charsInHiddenWord[];
    private char guessedWord[];
    
    /**
     * Constructor for objects of class Hangman
     */
    public Hangman()
    {
        // initialise instance variables
        RoundsLeft = 7;
        //pick a word
        HiddenWord = Words.randomWord();
        //print dialog
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * N E W  H A N G M A N  G A M E * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("                       hangman1                                  ");
        System.out.println("          ------------------------------------           ");
        System.out.println("                                                         ");
        System.out.println("You have 7 chances to find the word                      ");
        System.out.println("use method \"guess(char c)\" to guess a character          ");
        System.out.println("from: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
        System.out.println("or use method \"giveUp()\" to stop playing                 ");
        System.out.println("_________________________________________________________");
        
     HiddenWordLength = HiddenWord.length();
     charsInHiddenWord = new char[HiddenWordLength];
     guessedWord = new char[HiddenWordLength];
     
     for (int i=0;i<HiddenWordLength;i++)
     {
             guessedWord[i]='_';
     }
     
     for (int i=0;i<HiddenWordLength;i++)
     {
             charsInHiddenWord[i]=HiddenWord.charAt(i);
     }
    }
    
    /**
     * Constructor for objects of class Hangman
     */
    public void NewGame()
    {
        // initialise instance variables
        RoundsLeft = 7;
        HiddenWord = Words.randomWord();
        //print dialog
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * N E W  H A N G M A N  G A M E * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("                                                         ");
        System.out.println("          ------------------------------------           ");
        System.out.println("                                                         ");
        System.out.println("You have 7 chances to find the word                      ");
        System.out.println("use method \"guess(char c)\" to guess a character          ");
        System.out.println("from: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
        System.out.println("or use method \"giveUp()\" to stop playing                 ");
        System.out.println("_________________________________________________________");
        
     HiddenWordLength = HiddenWord.length();
     charsInHiddenWord = new char[HiddenWordLength];
     guessedWord = new char[HiddenWordLength];
     
     for (int i=0;i<HiddenWordLength;i++)
     {
             guessedWord[i]='_';
     }
     
     for (int i=0;i<HiddenWordLength;i++)
     {
             charsInHiddenWord[i]=HiddenWord.charAt(i);
     }
    }

    
    /**
     * Gives up the game
     * @param  none
     * @return none
     */
    public void giveUp()
    {
     System.out.println("   		 * * * * * * * * * * *");
     System.out.println("            * * G I V E   U P * *");
     System.out.println("            * * * * * * * * * * *");
     System.out.println("                                   ");
     System.out.println("          	the word was \""+HiddenWord+"\"");
     System.out.println("");
     System.out.println("_________________________________________________________");
     System.out.println("_________________________________________________________");
     System.out.println("                                                         ");
     System.out.println("use method \"newGame()\" to start a new game               ");
     System.out.println("_________________________________________________________");
     System.out.println("_________________________________________________________");
    }
    
    /**
     * Player makes a guess
     * @param  the charactes that the player guesses
     * @return none
     */
    public void guess(char c)
    {
    c = Character.toUpperCase(c);
    boolean success = false;
    for(int i=0;i<HiddenWordLength;i++)
      {
          if (charsInHiddenWord[i] == c){
              success = true;
              guessedWord[i] = c;
             }
         }
            
     if (success == false){
         RoundsLeft--;
        }
         
     System.out.println("YOUR GUESS: "+c);
     System.out.println();
     for(int i=0;i<HiddenWordLength;i++)
     {
         System.out.print(guessedWord[i]+" ");
        }
     System.out.println("            ");
     System.out.println("You have "+RoundsLeft+" chances to find the word                                   ");
     System.out.println("use method \"guess(char c)\" to guess a character");
     System.out.println("from: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
     System.out.println("or use method \"giveUp()\" to stop playing");
     System.out.println("_________________________________________________________");
     
     if (RoundsLeft == 0){
         NewGame();
        }
        
     if(Arrays.equals(charsInHiddenWord,guessedWord)){
         NewGame();
        }
        
    }
}
    
