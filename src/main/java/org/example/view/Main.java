package org.example.view;


import org.example.menu.BoatMenu;
import org.example.menu.BoatTypemenu;
import org.example.menu.MainMenu;
import org.example.menu.MainController;
import org.example.menu.MainMenuSina;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        boolean loop = true;
        while (loop) {
            System.out.println();
            System.out.println("BOAT MENU");
            System.out.println("=========");
            System.out.println("1. Boats");
            System.out.println("2. BoatTypes");
            System.out.println("3. Main Menu");
            System.out.println("9. Exit");
            System.out.println();
            System.out.print("Please make a choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BoatMenu.view();
                    break;
                case 2:
                    BoatTypemenu.view();
                    break;
                case 3, 9:
                    MainMenuSina.view();
                    break;

                default:
                    System.out.println("Input not valid, try again...");
            }
        }

    }


}





