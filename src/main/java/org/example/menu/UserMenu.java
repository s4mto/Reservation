package org.example.menu;

import java.util.Scanner;

public class UserMenu {
    public final static char ADDUSER = '1';
    public final static char EDITUSER = '2';
    public final static char DELETEUSER = '3';
    public final static char EXIT = '9';

    public static char view() {
        boolean loop = true;
        while(loop) {
            System.out.println();
            System.out.println("USER MENU");
            System.out.println("=========");
            System.out.println(ADDUSER + ". Add User");
            System.out.println(EDITUSER + ". Edit User");
            System.out.println(DELETEUSER + ". Delete User");
            System.out.println(EXIT + ". Exit");
            System.out.println();
            System.out.print("Please make a choice: ");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice.charAt(0)) {
                case ADDUSER:
                case EDITUSER:
                case DELETEUSER:
                case EXIT:
                    return choice.charAt(0);
                default:
                    System.out.println("Input not valid, try again...");
            }
        }
        return 'x'; //@ToDo what's happening here??
    }
}
