package org.example.menu;

import com.opencsv.exceptions.CsvException;
import org.example.model.Account;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class MainMenu {
    public static void view(Account account) throws IOException, ParseException, CsvException {
        boolean keepShowingMenu = true;
        while (keepShowingMenu) {
            System.out.println("Menu");
            System.out.println("____________________________________");
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Reservations");
            System.out.println("2. Boats");
            System.out.println("3. BoatTypes");
            if (account.getRole().equals("Manager")) {
                System.out.println("4. Account");
                System.out.println("5. Discount");
            }
            System.out.println("9. Exit");

            int choice = scanner.nextInt(); // read user input
            switch (choice) {
                case 1:
                    ReservationController.selection();
                    break;
                case 2:
                    ReservationController.selection();
                    break;
                case 3:
                    ReservationController.selection();
                    break;
                case 4:
                    ReservationController.selection();
                    break;
                case 5:
                    DiscountMenu.view();
                    break;
                case 9:
                    // exit the loop and terminate the program
                    keepShowingMenu = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}