package org.example.view;

import org.example.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserEdit {

    public static User edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the user Id you want to edit: ");
        String userid = scanner.nextLine();

        // Read the CSV file into a List of String arrays
        List<String[]> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/UserDB"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Find the line with the matching search value
        int lineNumber = -1;
        for (int i = 0; i < lines.size(); i++) {
            String[] values = lines.get(i);
            if (values.length > 0 && values[0].equals(userid)) {
                lineNumber = i;
                break;
            }
        }

        if (lineNumber == -1) {
            System.out.println("Line not found.");

        }

        Scanner s = new Scanner(System.in);

        System.out.print("firstName: ");
        String firstName = s.nextLine();

        System.out.print("lastName: ");
        String lastName = s.nextLine();

        System.out.print("email: ");
        String email = s.nextLine();

        System.out.print("password: ");
        String password = s.nextLine();

        System.out.print("phoneNumber: ");
        int phoneNumber = s.nextInt();
        s.nextLine();

        System.out.print("address: ");
        String address = s.nextLine();


        System.out.print("role: ");
        String role = s.nextLine();

        System.out.print("guest: ");
        boolean guest = s.nextBoolean();

        s.close();



        String[] newValues = new String[]{userid + "," + firstName + "," + lastName + "," + email + "," + password + "," + phoneNumber + "," + address + "," + role + "," + guest};

        // Update the selected line in the List
        lines.set(lineNumber, newValues);

        // Write the updated List back to the CSV file
        try (FileWriter writer = new FileWriter(new File("src/main/resources/UserDB"))) {
            for (String[] values : lines) {
                writer.write(String.join(",", values) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("User updated successfully.");
        return null;
    }

}

