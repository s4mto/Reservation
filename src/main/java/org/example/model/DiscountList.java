package org.example.model;
import com.opencsv.CSVReader;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.FileReader;

//This class in moudel packag
public class DiscountList {
    public static List<model.Discount>list = new ArrayList<>();
    public void read() {
        String file = "src/main/resources/boats.csv";
        BufferedReader reader = null;
        String line = "";
        try {
        reader = new BufferedReader(new FileReader(file));
         //reader.readNext();
         //String[] nextLine;
         while ((line = reader.readLine()) != null) {
         String[] row = line.split(";");
         for (String index : row) {
             System.out.printf("%-10s" , index);
         }

         }
        } catch (Exception e) {
        e.printStackTrace();
          }
        finally {
            try {
                reader.close();

            }catch (IOException e){
                e.printStackTrace();
            }

        }

        // @ToDo read csv


    }}

