package org.example.view;

import org.example.model.Reservation;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CreateReservationView {
    static Reservation reservation = new Reservation();

    public static void createReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("____________________________________");
        System.out.println("Maka a Reservation");
        System.out.println("____________________________________");
        String username = "Samet"
                ; // replace with actual username
        LocalDateTime now = LocalDateTime.now();
        String timestamp = now.format(DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"));
        String reservationId = username.substring(0, Math.min(username.length(), 3)).toUpperCase() + timestamp;
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

        String filename = "src/main/java/org/example/model/reservations.csv";
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.append(reservationId)
                    .append(",")
                    .append(String.valueOf(boatType))
                    .append(",")
                    .append(startDate1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))
                    .append(",")
                    .append(endDate1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))
                    .append(",")
                    .append(startTime1.format(DateTimeFormatter.ofPattern("HH:mm")))
                    .append(",")
                    .append(endTime1.format(DateTimeFormatter.ofPattern("HH:mm")))
                    .append(",")
                    .append(String.valueOf(numOfPeople))
                    .append(",")
                    .append(String.valueOf(infoOfPeople))
                    .append("\n");
            writer.flush();
            writer.close();
            System.out.println("Reservation data saved!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
