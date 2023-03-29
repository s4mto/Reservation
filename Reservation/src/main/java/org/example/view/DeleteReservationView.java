package org.example.view;

import java.io.*;
import java.util.Scanner;

public class DeleteReservationView {
    public static void deleteReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("____________________________________");
        System.out.println("Delete a Reservation");
        System.out.println("____________________________________");
        String csvFile = "src/main/java/org/example/model/reservations.csv";
        String line;
        String csvSplitBy = ",";
        System.out.print("Please type your reservation number!: ");
        String reservationNum = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
             FileWriter fw = new FileWriter(csvFile + ".tmp", true)) {
            while ((line = br.readLine()) != null) {
                String[] reservationInfo = line.split(csvSplitBy);
                if (!reservationInfo[0].equals(reservationNum)) {
                    // copy reservation information as is
                    fw.write(line + "\n");
                } else {
                    // reservation ID matches, skip writing the line
                    System.out.println("Reservation with ID " + reservationNum + " has been deleted.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // delete original file and rename temp file
        new File(csvFile).delete();
        new File(csvFile + ".tmp").renameTo(new File(csvFile));
    }
}
