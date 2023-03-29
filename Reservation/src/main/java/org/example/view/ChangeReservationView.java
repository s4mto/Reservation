package org.example.view;


import org.example.model.Reservation;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ChangeReservationView {
    static Reservation reservation = new Reservation();

    public static void changeReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("____________________________________");
        System.out.println("Change a Reservation");
        System.out.println("____________________________________");
        String csvFile = "src/main/java/org/example/model/reservations.csv";
        String line;
        String csvSplitBy = ",";
        System.out.print("Please type your reservation number!: ");
        String reservationId = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
             FileWriter fw = new FileWriter(csvFile + ".tmp", true)) {
            while ((line = br.readLine()) != null) {
                String[] reservationInfo = line.split(csvSplitBy);
                if (reservationInfo[0].equals(reservationId)) {
                    // prompt user to enter new reservation information
                    System.out.println("Current reservation information: " + line);
                    System.out.println("Supboard(1 Person) [ Supboard ] - Kajak(2 Persons) - [ Kajak ] - Rowing(4 Persons) [ Rowing ]- Electrical (4 Persons) [ Electrical ]");
                    System.out.print("Boat Type : ");
                    String boatType = scanner.nextLine();
                    System.out.print("Start Date (DD-MM-YYYY): ");
                    String startDate = scanner.nextLine();
                    LocalDate startDate1 = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    reservation.setStartDate(startDate);
                    System.out.print("End Date (DD-MM-YYYY): ");
                    String endDate = scanner.nextLine();
                    LocalDate endDate1 = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    reservation.setEndDate(endDate);
                    System.out.print("Start Time (HH:MM): ");
                    String startTime = scanner.nextLine();
                    DateTimeFormatter startTimeFormat = DateTimeFormatter.ofPattern("HH:mm");
                    LocalTime startTime1 = LocalTime.parse(startTime, startTimeFormat);
                    reservation.setStartTime(startTime);
                    System.out.print("End Time (HH:MM): ");
                    String endTime = scanner.nextLine();
                    DateTimeFormatter endTimeFormat = DateTimeFormatter.ofPattern("HH:mm");
                    LocalTime endTime1 = LocalTime.parse(endTime, endTimeFormat);
                    reservation.setEndTime(endTime);
                    System.out.print("How many people will there be: ");
                    int numOfPeople = Integer.parseInt(scanner.nextLine());
                    reservation.setNumOfPeople(numOfPeople);
                    System.out.print("Enter the firstname and lastname of attendees(Person1,Person2...): ");
                    String infoOfPeople = scanner.nextLine();
                    reservation.setInfoOfPeople(infoOfPeople);

                    // update reservation information
                    String[] updatedReservationInfo = {reservationId, boatType, String.valueOf(startDate1), String.valueOf(endDate1),
                            String.valueOf(startTime1), String.valueOf(endTime1), String.valueOf(numOfPeople), infoOfPeople};
                    fw.write(String.join(csvSplitBy, updatedReservationInfo) + "\n");
                    System.out.println("Reservation updated successfully!");
                } else {
                    // copy reservation information as is
                    fw.write(line + "\n");
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

