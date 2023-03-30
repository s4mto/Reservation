package org.example.view;

import org.example.model.Boats;

import java.util.Scanner;

public class RemoveBoats {


    public static void RemoveBoat() {
        int RemoveBoat = 0;
        for (int i = 0; i < Boats.list.size(); i++) {
            System.out.println(Boats.list.indexOf(i));
        }
        System.out.println();
        System.out.println("Please enter Boat ID to delete");
        Scanner scanner = new Scanner(System.in);
        RemoveBoat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < Boats.list.size(); i++) {
            if (Boats.list.contains(RemoveBoat)) {
                Boats.list.remove(i);
            }

        }
    }
}