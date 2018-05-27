import java.util.*;
/**
 * GradeBook
 * This program creates a gradebook menu for the user to input grades into
 * The user is then able to find the minimum, maximum, and average values from the grade value input
 * @author (Travis Gautier, Justin) 
 * 15 April 2014
 */

public class GradeBook
{
    //Constructor which runs the initial gradeBook method iteration
    public static void main(String[] args)
    {
        gradeBook();
    }
    //Method which runs the entire gradebook
    public static void gradeBook()
    {
        //Initialize scanners for keyboard input
        Scanner keyboard = new Scanner(System.in);
        Scanner gradeInput = new Scanner(System.in);
        
        //Initialize integers used in do-while loop
        int grade = 0;
        int choice = 0;
        int index = 0;
        int average = 0;
        
        //Initialize the array to hold the number of grades
        int[] gradebook = new int[10];
        
        //String input to handle menu selection.
        //Gets parsed into an integer, and throws an exception if numChoice is anything other than an integer.
        String numChoice;

        //Loop which handles the program.
        do //While != true
        {
            //Initial user message prompt.
            //Displayed after every new choice.
            System.out.println("**********GradeBook Menu**********");
            System.out.println("1. Enter grade (-99 to return to menu)");
            System.out.println("2. Class average");
            System.out.println("3. Class Maximum");
            System.out.println("4. Class Minimum");
            System.out.println("5. Exit");
            System.out.println("\n\n");
            System.out.print(" Enter your choice: ");
            try     //Determine if input is a number
            {
                //User input as a string variable
                numChoice = keyboard.nextLine();
                //Parse user input into an integer.
                choice = Integer.parseInt(numChoice);
            } 
            catch (NumberFormatException e)     //If user input is anything other than an integer, throws exception and reiterates gradeBook method
            {
                System.out.println("This is not a number\n\n");
                System.out.println(e.getMessage());
                gradeBook();
            }   
            try     //Determine if input is between 1 and 5
            {
                //If user input is not an integer between 1 and 5, throw exception.
                if (choice < 0 || choice > 5)
                    throw new BookException ();
            }
            catch(BookException e)
            {
                System.out.println(e.getMessage());
            }
            
            //Switch case handles user input for gradebook menu options
            switch(choice)
            {
                //Option 1: Enter Grades.
                case 1:
                System.out.println("\nPlease enter the grades into the gradebook. When finished, type '-99' to return to the main menu."); 
                try     //Catches whether or not a negative number is entered as a grade
                {   
                    //Loop which fills the gradebook array
                    while(grade != -99)
                    {
                        grade = gradeInput.nextInt();       //User input
                        if((grade < 0) && (grade != -99))   //If user input is negative, throw exception
                            throw new GradeException();
                        if(grade != -99)                    //If input is valid, load the value into the array and increment array by 1
                        {
                            gradebook[index] = grade;
                            index++;
                        }
                    }
                }catch(GradeException e)    //User input was negative
                {
                    System.out.println(e.getMessage());
                    System.out.println("Please re-enter your grades.\n\n");        //User prompt
                    if((grade < 0) && (grade != -99)){ //The user is a moron and we are shutting this thing down before any -real- damage is done.
                        System.out.println("There cannot be a grade less than zero. ");
                        System.out.println("Since I cannot do what you want, ");
                        System.out.println("the program will now end.");
                        System.exit(9999);}
                    if(grade != -99)    //If input is valid, load the value into the array and increment array by 1
                    {
                        gradebook[index] = grade;
                        index++;
                    }
                }
                break;

                //Option 2: Class Average
                case 2:
                try //Catches if the user has entered grades yet or not
                {
                    if(index == 0)      //If no grades entered, throw exception
                        throw new ValueException();
                    for(int i = 0; i < index; i++) //Loop which adds every grade in the array as the sum total of the average variable
                    {
                        average += gradebook[i];
                    }
                }
                catch(ValueException e)     //No grades were entered.
                {
                    System.out.println(e.getMessage());
                    gradeBook();
                }

                average = average/index;    //Divide the average total by the number different grades in the array
                System.out.println("\nThe average of the grades entered is " + average + "%.\n");   //Display to user
                break;

                //Option 3: Max Grade
                case 3:
                try //Catches if the user has entered grades yet or not
                {
                    if(index == 0)      //If no grades entered, throw exception
                        throw new ValueException();
                    int max = gradebook[0];     //Load initial array value as the max 
                    for(int i = 1; i < index; i++)  
                    {
                        int maxChecker = gradebook[i];  //Load values from each slot into max checker
                        if (max < maxChecker)   //Chcek the maxchecker value to the old max, if higher, replace with new value
                        {
                            max = maxChecker;
                        }
                    }
                    System.out.println("\nThe highest score entered was " + max + "%.\n");  //Display to user
                    break;
                }
                catch(ValueException e)     //No grades were entered
                {
                    System.out.println(e.getMessage());
                    gradeBook();
                }

                //Option 4: Min Grade
                case 4:
                try //Catches if the user has entered grades yet or not
                {
                    if(index == 0)      //If no grades entered, throw exception
                        throw new ValueException();
                    int min = gradebook[0];     //Load initial array value as the min
                    for(int i = 1; i < index; i++)
                    {
                        int minChecker = gradebook[i];  //Load values from each slot int min checker
                        if (min > minChecker)   //Check the maxchecker value to the old max, if higher, replace with new value
                        {
                            min = minChecker;
                        }
                    }
                    System.out.println("\nThe lowest score entered was " + min + "%.\n");   //Display to user
                    break;
                }
                catch(ValueException e)     //No grades were entered
                {
                    System.out.println(e.getMessage());
                    gradeBook();
                }

                //Choice 5, Exit the program
                default:
                System.out.println("Goodbye!");
                System.exit(100);
            }
        }while(true);
    }
}