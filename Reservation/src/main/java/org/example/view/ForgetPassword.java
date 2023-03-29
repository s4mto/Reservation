package org.example.view;

import java.util.Scanner;

public class ForgetPassword {
    public static boolean view() {
        System.out.println("Write Your Email:");
        Scanner scanner = new Scanner(System.in);
        String Email = scanner.nextLine();

        return true;
    }
}
