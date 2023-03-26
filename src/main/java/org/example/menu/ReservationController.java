package org.example.menu;

import org.example.view.ReservationMenuView;
import java.util.Scanner;
import static org.example.view.CreateReservationView.createReservation;
import static org.example.view.ChangeReservationView.changeReservation;
import static org.example.view.DeleteReservationView.deleteReservation;

public class ReservationController {
    public static void selection() {
        ReservationMenuView.view();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                createReservation();
                break;
            case 2:
                changeReservation();
                break;
            case 3:
                deleteReservation();
                break;
            case 9:
                System.out.println("Exiting Reservation Menu...");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
}
