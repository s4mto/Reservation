package org.example.view;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignUpView {
    public static boolean view() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name:");
        String Name = scanner.nextLine();
        System.out.print("last Name:");
        String LastName = scanner.nextLine();
        System.out.print("Email :");
        String SignUpEmail = scanner.nextLine();
        System.out.print("Phone:");
        String Phone = scanner.nextLine();
        System.out.print("Address :");
        String SignUpAddress = scanner.nextLine();
        System.out.print("Guest/Non-Guest:");
        String Guest = scanner.nextLine();

        String filename = "src/main/java/org/example/model/Account.csv";
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.append(Name)
                    .append(",")
                    .append(String.valueOf(LastName))
                    .append(",")
                    .append(String.valueOf(SignUpEmail))
                    .append(",")
                    .append(String.valueOf(Phone))
                    .append(",")
                    .append(String.valueOf(SignUpAddress))
                    .append(",")
                    .append(String.valueOf(Guest))
                    .append("\n");
            writer.flush();
            writer.close();
            System.out.println("Reservation data saved!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        return false;
    }
}
