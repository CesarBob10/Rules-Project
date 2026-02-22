/**
 * @author Julio Cebrero
 * 
 * Rule 13-FIO02-J: Detect and handle file-related erros
 */
package src.Rule6;

import java.io.IOException;

/**
 * Main class to demonstrate that checking return values of file
 * operations allows programs to detect and handle failures.
 */
public class Main {

    /**
     * Entry point of the program. Demonstrates successful and
     * failed file operations with proper error detection and handling.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        fileManager manager = new fileManager();

        // Create a file - checks return value to confirm success
        try {
            manager.createFile("test.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Write to the file
        try {
            manager.writeToFile("test.txt", "Hello World!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Rename the file - checks return value to confirm success
        try {
            manager.renameFile("test.txt", "renamed.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try to write to old file name - detected and handled since it was renamed
        try {
            manager.writeToFile("test.txt", "This will fail!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Delete the renamed file - checks return value to confirm success
        try {
            manager.deleteFile("renamed.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try to delete a file that doesnt exist - detected and handled
        try {
            manager.deleteFile("doesntexist.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}