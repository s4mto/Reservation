package org.example.view;

import org.example.model.Account;
import org.example.model.Accounts;

import java.util.Scanner;

public class LoginView {
    public static Account view(Accounts accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("UserName:");
        String UserName = scanner.nextLine();
        System.out.print("Password:");
        String PassWord = scanner.nextLine();


        // @ToDO check if userid and password are correct
        // loop over all accounts and find matching account
        // return that account

        return null;
    }
}
