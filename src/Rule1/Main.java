/**
 * @author Julio Cebrero
 * 
 * Rule 05-OBJ11-J: Be wary of letting constructors
 * throw exceptions
 * 
 * Helps demonstarte the compliant solution using
 * a final class to prevent finalizer attacks
 */
package src.Rule1;

public class Main {

    /**
     * Entry point of the program. Demonsrates a
     * fully initialized Dog object and a failed
     * partial initialization attempt.
     * 
     * @param args
     */
    public static void main(String[] args) {
        //Valid fully initialized Dog
        Dog first=new Dog("Bob",5);
        first.dogNoise();
        first.getInfo();

        //Partially initialized - will throw exception
        try{
            Dog second=new Dog(null,4);
        } catch(IllegalArgumentException e){
            System.out.println("Object not created: "+e.getMessage());
        }
    }
}
