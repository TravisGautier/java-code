import java.util.*;
/**
 * Grades
 * Main Grading Rubric
 * @author (Travis Gautier) 
 * @version (25 Feb 2014)
 */
public class Grades
{
    //Initialize variables
    int quiz1, quiz2, totalQuiz, midterm, finalExam; 
    double quizAverage, quizWeight, midWeight, finalWeight, finalGrade;
    
    //Method for handling the two quizzes
    public void quizzes()
    {
        //Ask for the two quiz score inputs
        System.out.println("Please input the two quiz scores for the student.");
        Scanner quizReader = new Scanner(System.in);
        quiz1 = quizReader.nextInt();
        quiz2 = quizReader.nextInt();
        //Check for valid test score
        if((quiz1 > 10 || quiz2 > 10)) {
            System.out.println("Quizzes are worth a total of 10 points. Please re-input both quiz scores.");
            quiz1 = quizReader.nextInt();
            quiz2 = quizReader.nextInt();}
        else if((quiz1 < 0 || quiz2  < 0)) {
            System.out.println("Student cannot score less than zero points. Please re-input both quiz scores.");
            quiz1 = quizReader.nextInt();
            quiz2 = quizReader.nextInt();}
        //Sum of both test scores
        totalQuiz = quiz1 + quiz2;
    }
    //Method for handling Midterm exam
    public void midterm()
    {
        //Ask for midterm score input
        System.out.println("Please input the midterm score for the student.");
        Scanner midtermReader = new Scanner(System.in);
        midterm = midtermReader.nextInt();
        //Check for valid test score
        if(midterm > 100) {
            System.out.println("The midterm is worth a total of 100 points. Please re-input score.");
            midterm = midtermReader.nextInt();}
        else if(midterm < 0) {
            System.out.println("Student cannot score less than zero points. Please re-input score.");
            midterm = midtermReader.nextInt();}
    }
    //Method for handling Final exam
    public void finalExam()
    {
        //Ask for final exam score input
        System.out.println("Please input the midterm score for the student.");
        Scanner finalReader = new Scanner(System.in);
        finalExam = finalReader.nextInt();
        //Check for valid test score
        if(finalExam > 100) {
            System.out.println("The midterm is worth a total of 100 points. Please re-input score.");
            finalExam = finalReader.nextInt();}
        else if(finalExam < 0) {
            System.out.println("Student cannot score less than zero points. Please re-input score.");
            finalExam = finalReader.nextInt();}
    }
    //Method for weighing test scores
    public void weighGrades()
    {
        //Find weighted grades
        quizAverage = (double)totalQuiz / 20;
        quizWeight = (double)25 * quizAverage;
        midWeight = (double)25 * midterm / 100;
        finalWeight = (double)50 * finalExam / 100;
        //Calculate final grade from weighted scores
        finalGrade = (quizWeight + midWeight + finalWeight);
    }
    //Method for determining final letter grade
    public void letterGrade()
    {
        //Determine the letter grade from the final grade
        String letterGrade = "";
        if(finalGrade >= 90) {
            letterGrade = "A";}
        else if(finalGrade >= 80) {
            letterGrade = "B";}
        else if(finalGrade >= 70) {
            letterGrade = "C";}
        else if(finalGrade >= 60) {
            letterGrade = "D";}
        else {
            letterGrade = "F";}
        //Final display output for user   
        System.out.println("The student's test scores:");
        System.out.println("Quiz 1: " + quiz1 + " out of 10");
        System.out.println("Quiz 2: " + quiz2 + " out of 10");
        System.out.println("Midterm: " + midterm + " out of 100");
        System.out.println("Final Exam: " + finalExam + " out of 100");
        System.out.println("Total Grade: " + finalGrade + "%");
        System.out.println("Letter Grade: " + letterGrade);
    }
}
