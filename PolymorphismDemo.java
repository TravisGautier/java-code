
/**
 * Class PolymorphismDemo.
 * Class which demonstrates polymorphism by writing the output of several different types of classes
 * @author (Travis Gautier) 
 * @version (14 April 2014)
 */
public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        //Initialize a new array
        Person[] people = new Person[8];
        //Fill array with predermined values
        people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
        people[1] = new Undergraduate("Kick, Anita", 9931, 2);
        people[2] = new Student("DeBanque, Robin", 8812);
        people[3] = new Undergraduate("Bugg, June", 9901, 4);
        people[4] = new Employee("Jobs, Steve", 1234);
        people[5] = new Faculty("Gates, Bill", 5678, "Professor of Computer Science");
        people[6] = new Staff("Butkus, Dicks", 9012, 18);
        people[7] = new Graduate("Gautier, Travis", 3456, "Computer Science");
        for (Person p : people) //loop which iterste so long as there are People filling the next
                                //slot in the array
        {
            p.writeOutput();    //writes the combined inherited output of the class
            System.out.println();
        }
    }
}