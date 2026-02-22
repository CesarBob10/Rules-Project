/**
 * @author Julio Cebrero
 * 
 * Rule 07-ERR07-J: Do not throw RuntimeException, Exception, or Throwable
 */
package src.Rule4;

import java.io.IOException;

/**
 * Represents a GradeCalculator that demonstrates being compliant with the 
 * rule by having proper exception throwing. All exceptions thrown are specific
 * rather than generic RutimeException or Excpetionto allowe callers to handle
 * errors properly.
 */
public class GradeCalculator {
    
    /**
     * Calculates the letter grade for a student.
     * Throws specific exceptions instead of generic ones so the caller knows 
     * what exactly went wrong.
     * @param studentName the name of the studnet, cannot be null
     * @param grade the student's grade, must be between 0 and 100
     * @return the letter grade as a String
     * @throws NullPointerException if studentName is null
     * @throws IllegalArgumentException if grade is outside 0 to 100 range
     */
    public String calculateGrade(String studentName, int grade){
        if(studentName==null){
            throw new NullPointerException("Student name cannot be null");
        }
        if(grade<0||grade>100){
            throw new IllegalArgumentException("Grade must be between 0 and 100!");
        }
        if(grade>=90) return "A";
        if(grade>=80) return "B";
        if(grade>=70) return "C";
        if(grade>=60) return "D";
        return "F";
    }

    /**
     * Saves the student grade to a file.
     * Declares specific IOException in the throws clause instead of a generic Exception
     * so the caller knows a file error occured.
     * @param studentName the name of the student, cannot be empty
     * @param grade the grade of the student to save
     * @throws IOException if the file cannot be written to
     */
    public void saveGrade(String studentName, String grade) throws IOException{
        if(studentName.isEmpty()){
            throw new IOException("Cannot write to file, student name is empty!");
        }
        System.out.println("Saved "+studentName+" 's grade: "+grade);
    }
}
