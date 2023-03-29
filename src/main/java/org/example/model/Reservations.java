package org.example.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reservations {
    private List<Reservation> reservations = new ArrayList<Reservation>();

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Reservations() {
        File file = new File("src/main/java/org/example/model/reservations.csv");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] reservation = scanner.nextLine().split(",");
                reservations.add(new Reservation());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void print() {
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}