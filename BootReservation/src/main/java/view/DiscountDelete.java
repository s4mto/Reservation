package view;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class DiscountDelete {
  
 

public static boolean remove() throws IOException, CsvException{
    Scanner scanner = new Scanner(System.in);
    System.out.println("____________________________________");
    System.out.println("Delete Discount");
    System.out.println("____________________________________");
    String csvFile = "C:\\Users\\sathabet\\IdeaProjects\\Discount management\\BootReservation\\src\\main\\resources\\discountCsv.csv";


    String line;
    String csvSplitBy = ",";

        CSVReader reader = new CSVReader(new FileReader(csvFile));
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            System.out.print("       " + nextLine[0] + "               " + nextLine[1] + "          " + nextLine[2] + "          " + nextLine[3] + "\n");
        }
        reader.close();

        System.out.print("Please Enter The Boat Type  ");
    String oldDiscount = scanner.nextLine();
    

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
        FileWriter fw = new FileWriter(csvFile + ".tmp", true)) {
       while ((line = br.readLine()) != null) {
           String[] discountInfo = line.split(csvSplitBy);
           if (!discountInfo[0].equals(oldDiscount)) {

               fw.write(line + "\n");
           } else {

               System.out.println("Discount with ID " + oldDiscount + " has been deleted.");
           }
               }
               } catch (IOException e) {
                       e.printStackTrace();
                       }
                       
                       
                       File oldFile =   new File(csvFile);
                       oldFile.delete();
                       File newFile = new File(csvFile+".tmp");
                       System.out.print(newFile.getName());
                       newFile.renameTo(oldFile);


   return false;
    }

    }

