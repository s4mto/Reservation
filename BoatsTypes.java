package org.example.model;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BoatsTypes {
    public List<BoatType> list = new ArrayList<>();

    public static BoatType readCSV() {
        return null;
    }

    public void read() {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\smojtahe\\IdeaProjects\\rezer\\src\\main\\resources\\typeId.csv"));
            reader.readNext();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                BoatType boatTypes = new BoatType();
                boatTypes.setTypeId(Integer.parseInt(nextLine[0]));
                boatTypes.setCapacity(Integer.parseInt(nextLine[1]));
                boatTypes.setChargingtime(Integer.parseInt(nextLine[2]));
                boatTypes.setPrice(Integer.parseInt(nextLine[3]));
                list.add(boatTypes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
