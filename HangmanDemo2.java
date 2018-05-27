import java.util.*;
/**
 * Hangman Version #1 Main Method
 * Runs the Game
 * @author (Travis Gautier) 
 * @version (25 Feb 2014)
 */
public class HangmanDemo2
{
    public static void main(String[] args) {
        //Declare a new instance of the Hangman2 game
        Hangman2 game1 = new Hangman2();

        //Initialize string variable for player names
        String player1 = "";
        String player2 = "";
        String word = "";
        String strNumber = "";

        int playerNumber = 0;

        boolean playerChoiceLoop = true;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("We are playing hangman! Try to beat the computer or your opponent.");

        do
        {
            //Choose how many players to begin the game with
            System.out.println("How many players would you like?");
            try
            {
                strNumber = keyboard.nextLine();
                //Parse user input into an integer.
                playerNumber = Integer.parseInt(strNumber);
                if(playerNumber == 1 || playerNumber == 2)
                {
                    playerChoiceLoop = false;
                }
            }
            catch (NumberFormatException e)     //If user input is anything other than an integer, throws exception and reiterates gradeBook method
            {
                System.out.println("This is not a number\n\n");
            } 
            //Catch to see if user inputted anything other than 1 or 2 players
            try
            {
                if(playerNumber > 2 || playerNumber < 1)
                {
                    throw new PlayerException();
                }
            }
            catch (PlayerException e)
            {
                System.out.println(e.getMessage());
            }
        }while (playerChoiceLoop == true);

        //Switch case which determines which game is played
        switch (playerNumber)
        {
            //1 Player Game
            case 1: 
            System.out.println("You have chosen to play a solo game of Hangman.");
            game1.playerName(player1);

            game1.setWords(player1);
            game1.initialize(game1.randomize(player1));
            game1.playGame();
            break;

            //2 Player Game
            case 2: 
            System.out.println("you have chosen to play a two player game of Hangman.");
            game1.playerName(player1);
            game1.playerName(player1, player2);

            game1.setWords(player1, player2);
            game1.initialize(game1.randomize(player1));
            game1.playGame();

            System.out.println("Next player, get ready to play!");
            game1.initialize(game1.randomize(player1, player2));
            game1.playGame();

            System.out.println("Thanks for playing!");
            System.exit(0);

            break;
        }

    }
}
