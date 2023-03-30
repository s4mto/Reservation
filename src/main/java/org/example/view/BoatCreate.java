package org.example.view;

import com.opencsv.CSVWriter;
import org.example.model.Boat;
import org.example.model.BoatType;
import org.example.model.Boats;
import org.example.view.BoatCreate;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class BoatCreate {
    public static Boat view() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("boatId: ");
        String boatId = scanner.nextLine();


        System.out.print("boatName: ");
        String boatName = scanner.nextLine();

        scanner.nextLine();
        System.out.print("boatType: ");
        int boatType = scanner.nextInt();
        scanner.close();

        return new Boat(boatId,boatName,boatType);


}
}