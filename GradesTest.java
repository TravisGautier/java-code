/**
 * GradesTest
 * Runs the Grades class
 * @author (Travis Gautier) 
 * @version (27 Feb 2014)
 */
public class GradesTest
{
    public static void main(String[] args) {
        //Initialize a new score
        Grades score = new Grades();
        //Run methods from class Grades
        score.quizzes();
        score.midterm();
        score.finalExam();
        score.weighGrades();
        score.letterGrade();
}
}