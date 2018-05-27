import java.util.*;
/**
 * Hangman2 Version #1
 * Basic Game Setup
 * @author (Travis Gautier) 
 * @version (03 April 2014);
 */
public class Hangman2 {

    //class variables defined as private
    private String secretWord;
    private String disguisedWord;
    private String lettersRemaining;
    private int guessesMade;
    private int incorrectGuesses;
    private String player1Array[];
    private String player2Array[];

    boolean nameLoop1 = true;
    boolean nameLoop2 = true;

            //initalize name variables
    String playerName1 = "";
    String playerName2 = "";

    //initalize new keyboard scanner
    Scanner keyboard = new Scanner(System.in);

    //this method is void but expects a string to bent in and does basic setup
    public void initialize(String tempWord) {
        secretWord = tempWord.toLowerCase().trim();
        lettersRemaining = secretWord;
        disguisedWord = createDisguisedWord(secretWord);
        guessesMade = 0;
        incorrectGuesses = 0;
    }

    //1 Player Method
    //Determines name of player
    public String playerName(String player1)
    {
        do
        {
            try
            {
                System.out.println("What is the first player's name?");
                playerName1 = keyboard.nextLine();
                if ((playerName1.length() == 0) || (playerName1.length() > 20))
                {
                    throw new NameException();
                }
                else
                {
                    nameLoop1 = false;
                }
            }
            catch (NameException e)
            {
                System.out.println(e.getMessage());
            }
            
        }while(nameLoop1 == true);
        return playerName1;
    }

    //2 Player Method
    //Determine names of both players
    public String playerName(String player1, String player2)
    {
        do
        {
            try
            {
                System.out.println("What is the second player's name?");
                playerName2 = keyboard.nextLine();
                if ((playerName2.length() == 0) || (playerName2.length() > 20))
                {
                    throw new NameException();
                }
                else
                {
                    nameLoop2 = false;
                }
            }
            catch (NameException e)
            {
                System.out.println(e.getMessage());
            }
            
        }while(nameLoop2 == true);
        return playerName2;
    }
    //1 Player Method
    //This is the array for a single player game of hangman.
    public void setWords(String player1)
    {
        //comment
        player1Array = new String[5];
        player1Array[0] = "Impossible";
        player1Array[1] = "Unsolvable";
        player1Array[2] = "Redundant";
        player1Array[3] = "Obnoxious";
        player1Array[4] = "Great learning experience";
    }

    //2 Player Method
    //This method sets up user input arrays for each player's words
    public void setWords(String player1, String player2)
    {
        //Initializations for keyboard input and array setup
        Scanner keyboard = new Scanner(System.in);
        player1Array = new String[5];
        player2Array = new String[5];

        //player 1 setup 
        //User defined array
        System.out.println(playerName1 + ", please enter your five words, press enter after each word.");

        for (int i = 0; i < 5; i++){
            player1Array[i] = keyboard.nextLine();
        }

        //player 2 setup
        //User defined array
        System.out.println(playerName2 + ", please enter your five words, press enter after each word.");

        for (int i = 0; i < 5; i++){
            player2Array[i] = keyboard.nextLine();
        }
    }

    //1 Player Method
    //Method for choosing a random string from the array(s) provided.
    public String randomize(String player1)
    {   
        //New instance of Random
        Random random = new Random();

        //Randomly selects an index from the array
        int select = random.nextInt(4);
        String tempWord = player1Array[select];
        return tempWord;

    }

    //2 Player Method
    //Method for choosing a random string from the array(s) provided.
    public String randomize(String player1, String player2)
    {   
        //New instance of Random
        Random random = new Random();

        //Randomly selects an index from the array
        int select2 = random.nextInt(4);
        String tempWord = player2Array[select2];
        return tempWord;

    }
    //This method returns a hidden word and takes in a string that is changed to said hidden word.
    public String createDisguisedWord(String word){
        word = word.toLowerCase();
        word = word.replace('a', '?');
        word = word.replace('b', '?');
        word = word.replace('c', '?');
        word = word.replace('d', '?');
        word = word.replace('e', '?');
        word = word.replace('f', '?');
        word = word.replace('g', '?');
        word = word.replace('h', '?');
        word = word.replace('i', '?');
        word = word.replace('j', '?');
        word = word.replace('k', '?');
        word = word.replace('l', '?');
        word = word.replace('m', '?');
        word = word.replace('n', '?');
        word = word.replace('o', '?');
        word = word.replace('p', '?');
        word = word.replace('q', '?');
        word = word.replace('r', '?');
        word = word.replace('s', '?');
        word = word.replace('t', '?');
        word = word.replace('u', '?');
        word = word.replace('v', '?');
        word = word.replace('w', '?');
        word = word.replace('x', '?');
        word = word.replace('y', '?');
        word = word.replace('z', '?');

        return word;
    }

    //This method is void and takes in a character this is the letter guess and checking to see if correct.
    public void makeGuess(Character c) {
        if(Character.isLetter(c)){
            String guess = "" + c;
            guess = guess.toLowerCase();
            int letterPosition = lettersRemaining.indexOf(guess);
            boolean goodGuess = letterPosition > -1;
            while(letterPosition > -1){
                String before = lettersRemaining.substring(0, letterPosition);
                String after = lettersRemaining.substring(letterPosition+1);
                lettersRemaining = before + "#" + after;

                before = disguisedWord.substring(0, letterPosition);
                after = disguisedWord.substring(letterPosition+1);
                disguisedWord = before + guess + after;

                letterPosition = lettersRemaining.indexOf(guess);
            }

            guessesMade++;

            if(!goodGuess)
                incorrectGuesses++;
        } else
            System.out.println("Sorry, your guess must be an alphabet character from a to z");
        if (incorrectGuesses >= 5)
        {
            System.out.println("You lose");
            System.exit(99999999);
        }
    }

    //accessor method for the hidden word
    public String getDisguisedWord(){
        return disguisedWord;
    }

    //accessor method for the secret word
    public String getSecretWord(){
        return secretWord;
    }

    //accessor method for the guess
    public int getGuessCount(){
        return guessesMade;
    }

    //this method returns a boolean based on the mhidden word being correct
    public boolean isFound(){
        return secretWord.equals(disguisedWord);
    }

    //This is a void method that starts the game
    public void playGame(){
        if(!isFound()){
            System.out.println("We are playing hangman");
            while(!isFound()){
                System.out.println("\nThe disguised word is <" + disguisedWord + ">");
                System.out.println("Guess a letter");
                Scanner reader = new Scanner(System.in);
                String guess = reader.next();
                if(guess.length()!= 1)
                    System.out.println("Sorry, bad guess. Need a single letter.");
                else {
                    makeGuess(new Character(guess.charAt(0)));
                }
                System.out.println("Guesses made " + guessesMade + " with " + incorrectGuesses + " wrong");
            }
            System.out.println("Congratulations, you found the secret word: " + secretWord);
        }
    }

}
