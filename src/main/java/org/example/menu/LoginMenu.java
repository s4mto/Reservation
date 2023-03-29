package org.example.menu;

import org.example.model.Account;
import org.example.model.Accounts;
import org.example.view.ForgetPassword;
import org.example.view.LoginView;
import org.example.view.SignUpView;

import java.util.Scanner;

public class LoginMenu {
    public static void view(Accounts accounts) {
        boolean keepShowingMenu = true;
        while (keepShowingMenu){
            System.out.println("Welcome to Molven Lake Resort China");
            System.out.println("____________________________________");
            System.out.println("1. Log In :");
            System.out.println("2. Forget Password :");
            System.out.println("3. Sign Up :");
            System.out.println("9. Exit :");
            System.out.println();
            System.out.println(" Please Make a Choice ");


            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();

            boolean exit = false;
            switch (s.charAt(0)) {
                case '1':
                    Account loggedInPerson = LoginView.view(accounts);
                    if (loggedInPerson != null)
                        MainMenu.view(loggedInPerson);
                    break;
                case '2':
                    if (ForgetPassword.view())
                        // @ToDo next menu
                        break;
                case '3':
                    if (SignUpView.view())
                    // @ToDo next menu
                    {
                        break;
                    }
                case '9':
                    break;

                default:
                    System.out.println("input not valid try again ...");

            }
        }
    }
}
