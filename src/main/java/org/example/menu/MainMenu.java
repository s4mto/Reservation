package org.example.menu;

import org.example.model.Account;

public class MainMenu {
    public static void view(Account account) {
        boolean keepShowingMenu = true;
        while (keepShowingMenu) {
            System.out.println("Menu");
            System.out.println("____________________________________");
            System.out.println("1. Account");
            System.out.println("2. Boats");
            System.out.println("3. BoatTypes");
            if (account.getRole().equals("Manager"))
                System.out.println("4. Discount");
            System.out.println("5. Reservations");
            System.out.println("9. Exit");

        }
    }
}
