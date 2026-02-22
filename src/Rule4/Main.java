/**
 * @author Julio Cebrero
 * 
 * Rule 07-ERR07-J: Do not throw RuntimeException, Exception, or Throwable
 */
package src.Rule4;

import java.io.IOException;

/**
 * Main class that demonstrates that throwing specific exceptions allows
 * callers to identify and handle errors appropriately rather than catching
 * generic exceptions.
 */
public class Main {

    /**
     * Entry point of the program. Demonstrates valid and invalid grade
     * calculations and file saving with specific excpetion handling.
     * @param args not used
     */
    public static void main(String[] args) {
        GradeCalculator calculator=new GradeCalculator();

        //Valid grade calculation
        String grade=calculator.calculateGrade("Bob",85);
        System.out.println("Bob's grade: "+grade);

        //Null student name - catches specific NullPointerException
        try{
            calculator.calculateGrade(null, 85);
        }catch(NullPointerException e){
            System.out.println("Error: "+e.getMessage());
        }

        //Invalid grade range - catches specific IllegalArgumentException
        try{
            calculator.calculateGrade("Peter", 150);
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        //Save valid grade - catches specific IOException
        try{
            calculator.saveGrade("John", grade);
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }

        //Save with empty name - catches specific IOException
        try{
            calculator.saveGrade("",grade);
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
