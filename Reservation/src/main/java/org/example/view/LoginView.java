package org.example.view;

import org.example.model.Account;
import org.example.model.Accounts;

import java.util.Scanner;

public class LoginView {
    public static Account view(Accounts accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("UserName:");
        String userName = scanner.nextLine();
        System.out.print("Password:");
        String passWord = scanner.nextLine();

        for (Account account: accounts.list)
            if (account.userName.equals(userName) && account.Password.equals(passWord))
                return account;

        return null;
    }
}
