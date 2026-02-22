/**
 * @author Julio Cebrero
 * 
 * Rule 06-MET00-J: Validate Method Arguments
 * 
 * Represents a Student object that helps demonstrate the rule by
 * adding validation to method arguments and also validating the
 * internal state before use.
 */

package src.Rule2;

public class Student {
    /**The name of the student */
    private String name;

    /**The gpa of the student */
    private double gpa;

    /**
     * Constructs a fully initialized Student object
     * @param name the name of the student, cannot be null
     * @param gpa the gpa of the student, must be between 0.0 and 4.0
     * @throws IllegalArgumentException if name  is null or GPA is invalid
     */
    public Student(String name,double gpa){
        if(name==null){
            throw new IllegalArgumentException("Name cannot be null!");
        }
        if(Double.isNaN(gpa)||Double.isInfinite(gpa)||gpa<0.0||gpa>4.0){
            throw new IllegalArgumentException("Gpa value is not valid!");
        }
        this.name=name;
        this.gpa=gpa;
    }

    /**
     * Sets the name of the Student after validating the argument
     * @param name the new name, cannot be null
     * @throws IllegalArgumentException if name is null
     */
    public void setName(String name){
        if(name==null)
        {
             throw new IllegalArgumentException("Name cannot be null!");
        }
        else{
        this.name=name;
        }
    }

    /**
     * Returns the student's name after verifying internal state
     * @return the student's name
     * @throws IllegalStateException if name is in an invalid state
     */
    public String getName(){
        if(this.name==null){
             throw new IllegalStateException("Name is in invalid state!");
        }
        else{
            return this.name;
        }
    }

    /**
     * Sets the student's GPA after validating the argument
     * @param gpa the new GPA, must be between 0.0 and 4.0
     * @throws IllegalArgumentException if GPA is invalid
     */
    public void setGpa(double gpa){
        if(Double.isNaN(gpa)||Double.isInfinite(gpa)||gpa<0.0||gpa>4.0){
            throw new IllegalArgumentException("Gpa value is not valid!");
        }
        else{
            this.gpa=gpa;
        }
    }

    /**
     * Returns the student's GPA after verifying internal state.
     * @return the student's GPA
     * @throws IllegalStateException if GPA is in an invalid state
     */
    public double getGpa(){
        if(Double.isNaN(gpa)||Double.isInfinite(gpa)||gpa<0.0||gpa>4.0){
            throw new IllegalStateException("Gpa is in invalid state!");
        }
        else{
            return this.gpa;
        }
    }
}
