/**
 * @author Julio Cebrero
 * 
 * Rule 05-OBJ11-J: Be wary of letting constructors
 * throw exceptions
 * 
 * Represents a Dog object that helps demonsrate the rule by
 * declaring the class final to prevent finalizer attacks when
 * an Exception is thrown by the constructor.
 */

package src.Rule1;

public final class Dog {
    /** The name of the dog */
    private String name;

    /** The age of the dog in years */
    private int age;

    /**
     * Contructs a fully intialized Dog object
     * @param name the name of the dog, cannot be null
     * @param age the age of the dog
     * @throws IllegalArgumentException
     */
    public Dog(String name,int age){
        if(name==null){
            throw new IllegalArgumentException("Name cannot be null!");
        }
        this.name=name;
        this.age=age;
    }

    /**
     * Prints the sound a dog makes.
     */
    public void dogNoise(){
        System.out.println("bark");
    }

    /**
     * Displays the dog's information.
     */
    public void getInfo(){
        System.out.println("Dog Information:\nName: "+this.name+"\nAge: "+this.age+" years old");
    }
}
