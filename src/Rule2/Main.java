/**
 * @author Julio Cebrero
 * 
 * Rule 06-MET00-J: Validate Method Arguments
 */
package src.Rule2;

/**
 * Main class helps demonstrate compliant solution by using
 * the Student class which validates the method 
 * arguments
 */
public class Main {

    /**
     * Entry point of the program. Demonstrates a
     * well initialized Student object and also demonstrates
     * Student objects that are not initialized correctly.
     * Also demonstrates Student methods with wrong arguments
     * passed.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        //Valid fully initialized Student
        Student first=new Student("Bob",3.5);
        System.out.println("Name: "+first.getName());
        System.out.println("GPA: "+first.getGpa());

        //Student with invalid name argument intialized
        try{
            Student student2 = new Student(null,3.5);
        }catch(IllegalArgumentException e){
            System.out.println("Error creating student: "+e.getMessage());
        }

        //Student with invalid gpa argument intialized
        try{
            Student student3 = new Student("Jane",5.0);
        }catch(IllegalArgumentException e){
            System.out.println("Error creating student: "+e.getMessage());
        }

        //Student with invalid gpa argument intialized
        try{
            Student student4 = new Student("John",Double.NaN);
        }catch(IllegalArgumentException e){
            System.out.println("Error creating student: "+e.getMessage());
        }

        //setName method with invalid argument called
        try{
            first.setName(null);
        }catch(IllegalArgumentException e){
            System.out.println("Error setting name: "+e.getMessage());
        }

        //setGpa with invalid argument called
        try{
            first.setGpa(-1.0);
        }catch(IllegalArgumentException e){
            System.out.println("Error setting GPA: "+e.getMessage());
        }


    }
}
