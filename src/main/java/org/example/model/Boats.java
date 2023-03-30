package org.example.model;

import com.opencsv.CSVReader;
import org.example.view.BoatCreate;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Boats {
    public static List<Boat> list = new ArrayList<>();

    public static Boats read() {

        Boats boats = new Boats();

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("src/main/java/org/example/model/boats.csv"));
            reader.readNext();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                Boat boat = new Boat();
                boat.setBoatId(nextLine[0]);
                boat.setBoatName(nextLine[1]);
                boat.setBoatType(Integer.parseInt(nextLine[2]));
                boats.list.add(boat);
            }
            print();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return boats;
    }

    public static void print(){
        for (Boat boat : list)
            System.out.println(boat);
    }
}


