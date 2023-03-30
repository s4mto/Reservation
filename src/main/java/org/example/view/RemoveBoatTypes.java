package org.example.view;

import org.example.model.Boats;
import org.example.model.BoatsTypes;

import java.util.Scanner;

public class RemoveBoatTypes {
    public static void RemoveBoatTypes() {
        int RemoveBoat = 0;
        for (int i = 0; i < BoatsTypes.list.size(); i++) {
            System.out.println(Boats.list.indexOf(i));
        }
        System.out.println();
        System.out.println("Please enter Boat ID to delete:");
        Scanner scanner = new Scanner(System.in);
        int RemoveBoatTypes = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < Boats.list.size(); i++) {
            if (Boats.list.contains(RemoveBoatTypes)) {
                BoatsTypes.list.remove(i);
            }

        }
    }
}

