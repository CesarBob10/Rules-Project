/**
 * @author Julio Cebrero
 * 
 * Rule 13-FIO02-J: Detect and handle file-related erros
 */
package src.Rule6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Represents a FileManager that demonstrates proper file error detection.
 * All file operations check their return values to ensure failures are
 * detected and handled.
 */
public class fileManager {

    /**
     * Creates a new file at the specified path.
     * Checks the return value to detect if creation failed.
     * @param fileName the name of the file to create
     * @throws IOException if the file cannot be created
     */
    public void createFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.createNewFile()) {
            throw new IOException("File creation failed: " + fileName);
        }
        System.out.println("File created successfully: " + fileName);
    }

    /**
     * Writes content to an existing file.
     * @param fileName the name of the file to write to
     * @param content the content to write
     * @throws IOException if the file cannot be written to
     */
    public void writeToFile(String fileName, String content) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new IOException("File does not exist: " + fileName);
        }
        FileWriter writer = new FileWriter(file);
        writer.write(content);
        writer.close();
        System.out.println("Successfully wrote to file: " + fileName);
    }

    /**
     * Deletes a specified file.
     * Checks the return value to detect if deletion failed.
     * @param fileName the name of the file to delete
     * @throws IOException if the file cannot be deleted
     */
    public void deleteFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.delete()) {
            throw new IOException("File deletion failed: " + fileName);
        }
        System.out.println("File deleted successfully: " + fileName);
    }

    /**
     * Renames a file from oldName to newName.
     * Checks the return value to detect if rename failed.
     * @param oldName the current name of the file
     * @param newName the new name for the file
     * @throws IOException if the file cannot be renamed
     */
    public void renameFile(String oldName, String newName) throws IOException {
        File oldFile = new File(oldName);
        File newFile = new File(newName);
        if (!oldFile.renameTo(newFile)) {
            throw new IOException("File rename failed: " + oldName);
        }
        System.out.println("File renamed successfully from " + oldName + " to " + newName);
    }
}

