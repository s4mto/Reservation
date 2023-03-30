package org.example.menu;

import org.example.menu.BoatTypeController;

import java.util.Scanner;


    public class MainMenuSina {

        public final static char ROLE = '1';
        public final static char BOATS = '2';
        public final static char BOATTYPES = '3';
        public final static char RESERVATION = '4';
        public final static char EXIT = '9';

        public static char view() {
            boolean loop = true;
            while(loop) {
                System.out.println();
                System.out.println("Main menu");
                System.out.println("=========");
                System.out.println(ROLE + ". Roles");
                System.out.println(BOATS + ". Boats");
                System.out.println(BOATTYPES + ". Boat Types");
                System.out.println(RESERVATION + ". Roles");
                System.out.println(EXIT + ". Exit");
                System.out.println();
                System.out.print("Please make a choice: ");

                Scanner scanner = new Scanner(System.in);
                String choice = scanner.nextLine();

                switch (choice.charAt(0)) {
                    case ROLE:
                        break;
                    case BOATS:BoatMenu.view();
                        break;
                    case BOATTYPES:BoatTypemenu.view();
                        break;
                    case RESERVATION:
                        break;
                    case EXIT:
                        return choice.charAt(0);
                    default:
                        System.out.println("Input not valid, try again...");
                }
            }
            return ' '; //@ToDo what's happening here??
        }
    }


