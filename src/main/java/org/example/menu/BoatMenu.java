package org.example.menu;

import com.opencsv.CSVReader;
import org.example.model.Boats;
import org.example.view.BoatCreate;
import org.example.view.RemoveBoats;

import java.util.Scanner;

public class BoatMenu {

    public static char view() {
        boolean loop = true;
        while (loop) {
            System.out.println();
            System.out.println("BOAT MENU");
            System.out.println("=========");
            System.out.println("1.  BOAT LIST");
            System.out.println("2. CREATE BOAT");
            System.out.println("3. REMOVE BOAT");
            System.out.println("9. EXIT");
            System.out.println();
            System.out.print("Please make a choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:

                      Boats.read();

                case 2:
                    BoatCreate.view();
                    break;
                case 3:
                    RemoveBoats.RemoveBoat();

                case 9:
                    MainMenuSina.view();
                    return 9;
                default:
                    System.out.println("Input not valid, try again...");
            }
        }
        return ' '; //@ToDo what's happening here??
    }
}
