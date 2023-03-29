package org.example.view;

import java.util.Scanner;

public class ReservationMenuView {
    public static void view() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Reservation");
            System.out.println("____________________________________");
            System.out.println("1. Maka a Reservation");
            System.out.println("2. Change a Reservation");
            System.out.println("3. Delete a Reservation");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
    }
}