package org.example.menu;
import org.example.model.BoatsTypes;
import org.example.view.BoatTypeCreate;
import org.example.view.RemoveBoatTypes;

import java.util.Scanner;

public class BoatTypemenu {

    public static char view() {
        boolean loop = true;
        while (loop) {
            System.out.println();
            System.out.println("BOAT TYPE MENU");
            System.out.println("=========");
            System.out.println("1. BOATTYPE LIST");
            System.out.println("2. CREATE BOATTYPE");
            System.out.println("3. REMOVE BOATTYPE");
            System.out.println("9. Exit");
            System.out.println();
            System.out.print("Please make a choice: ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BoatsTypes.view();


                    break;
                case 2:
                    BoatTypeCreate.view();
                    break;
                case 3:
                    RemoveBoatTypes.RemoveBoatTypes();
                case 9: MainMenuSina.view();
                    return 9;
                default:
                    System.out.println("Input not valid, try again...");
            }
        }
        return ' '; //@ToDo what's happening here??
    }
}
