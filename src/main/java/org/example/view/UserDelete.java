package org.example.view;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class UserDelete {

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the user Id you want to delete: ");
        String userId = scanner.nextLine();
        try {
            // Open the input file and a random access file
            File inputFile = new File("src/main/resources/UserDB");
            RandomAccessFile raf = new RandomAccessFile(inputFile, "rw");

            // Read the first line
            String currentLine = raf.readLine();
            String firstelement = currentLine.split(",")[0];
            boolean found = false;
            long currentPos = raf.getFilePointer();

            // Loop through the remaining lines
            while (currentLine != null) {
                // Check if the line starts with the search value
                if (firstelement.equals(userId)) {
                    found = true;
                    break;
                }
                currentPos = raf.getFilePointer();
                currentLine = raf.readLine();
                if(currentLine != null) {
                    firstelement = currentLine.split(",")[0];
                }
            }

            if (found) {
                // Move to the beginning of the line
                raf.seek(currentPos);

                // Skip the line
                raf.readLine();

                // Write the remaining lines to the file
                long writePos = currentPos;
                currentLine = raf.readLine();
                while (currentLine != null) {
                    raf.seek(writePos);
                    raf.writeBytes(currentLine + System.lineSeparator());
                    writePos = raf.getFilePointer();
                    currentLine = raf.readLine();
                }

                // Truncate the file to remove the extra line
                raf.setLength(writePos);

                System.out.println("The user has been deleted successfully.");
            } else {
                System.out.println("The user could not be found in the system.");
            }

            // Close the random access file
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
