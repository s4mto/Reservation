package org.example.model;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public  class BoatsTypes {

    public static List<String> list = new ArrayList<>();

    public static void view() {


        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("src/main/java/org/example/model/typeId.csv"));
            reader.readNext();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                BoatType boatTypes = new BoatType();
                boatTypes.setTypeId(Integer.parseInt(nextLine[0]));
                boatTypes.setCapacity(Integer.parseInt(nextLine[1]));
                boatTypes.setChargingtime(Integer.parseInt(nextLine[2]));
                boatTypes.setPrice(Integer.parseInt(nextLine[3]));
                list.add(String.valueOf(boatTypes));
                System.out.println(list);
            }
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}