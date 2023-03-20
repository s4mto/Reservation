package org.example.view;

import java.util.Scanner;

public class SignUpView {
    public static boolean view(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name:");
        String Name = scanner.nextLine();
        System.out.print("last Name:");
        String LastName = scanner.nextLine();
        System.out.print("Email :");
        String SignUpEmail = scanner.nextLine();
        System.out.print("Phone:");
        String Phone = scanner.nextLine();
        System.out.print("Address :");
        String SignUpAddress = scanner.nextLine();
        System.out.print("Guest/Non-Guest:");
        String Guest = scanner.nextLine();




        return true;
        
    }
}
