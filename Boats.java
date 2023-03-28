package org.example.model;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Boats {
    public List<Boat> list = new ArrayList<>();

    public void read() {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\smojtahe\\IdeaProjects\\rezer\\src\\main\\resources\\boats.csv"));
            reader.readNext();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                Boat boat = new Boat();
                boat.setBoatId(nextLine[0]);
                boat.setBoatName(nextLine[1]);
                boat.setBoatType(Integer.parseInt(nextLine[2]));
                list.add(boat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
