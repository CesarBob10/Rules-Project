/**
 * @author Julio Cebrero
 * 
 * Rule 07-ERR00-J: Do not suppress or ignore checked exceptions
 */

package src.Rule5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * The readFile class demonstrates the rule because it doesn't suppress or ignore
 * checked exceptions insted the class properly handles a FileNotFoundException by
 * prompting the user to enter a valid file name.
 */
public class readFile {

    /**
     * Prompts the user for a file name until a valid file is found,
     * then reads and prints its contents.
     * 
     * @param scanner the Scanner used to read user input
     * @throws IOException if an I/O error occurss other than file not found
     */
    public static void readUserFile(Scanner scanner) throws IOException{
        boolean validFlag=false;
        do{
            System.out.print("Enter file name: ");
            String fileName=scanner.nextLine();

            try{
                BufferedReader reader= new BufferedReader(new FileReader(fileName));
                String line;
                while((line=reader.readLine())!=null){
                    System.out.println(line);
                }
                reader.close();
                validFlag=true;
            }catch(FileNotFoundException e){
                System.out.println("File not found. Please enter a valide file name.");
            }
        }while(!validFlag);
    }

    /**
     * Entry point of the program.
     * 
     * @param args command-line arguments (not used)
     * @throws IOException if an unexpected I/O error occurs.
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        readUserFile(scanner);
        scanner.close();
    }
}
