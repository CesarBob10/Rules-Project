/**
 * @author Julio Cebrero
 * 
 * Rule 05-OBJ11-J: Be wary of letting constructors
 * throw exceptions
 * 
 * Helps demonstarte the compliant solution using
 * a finnal class to prvent finalizer attacks
 */
package src.Rule1;

public class Main {
    public static void main(String[] args) {
        Dog first=new Dog("Bob",5);
        first.dogNoise();
        first.getInfo();

        try{
            Dog second=new Dog(null,4);
        } catch(IllegalArgumentException e){
            System.out.println("Object not created: "+e.getMessage());
        }
    }
}
