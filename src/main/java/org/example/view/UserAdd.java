package org.example.view;

import org.example.model.User;
import java.util.Scanner;

public class UserAdd {

    public static User view(int userId) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("firstName: ");
        String firstName = scanner.nextLine();

        System.out.print("lastName: ");
        String lastName = scanner.nextLine();

        System.out.print("email: ");
        String email = scanner.nextLine();

        System.out.print("password: ");
        String password = scanner.nextLine();

        System.out.print("phoneNumber: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("address: ");
        String address = scanner.nextLine();


        System.out.print("role: ");
        String role = scanner.nextLine();

        System.out.print("guest: ");
        boolean guest = scanner.nextBoolean();

        scanner.close();



        return new User(userId, firstName, lastName, email, password, phoneNumber, address, role, guest);
    }
}
