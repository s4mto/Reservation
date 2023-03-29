package org.example.view;


import model.Discount;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiscountUpdate {
    static Discount discount = new Discount();

    public static boolean view() throws IOException, CsvValidationException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("____________________________________");
        System.out.println("Change Discount");
        System.out.println("____________________________________");
        String csvFile = "C:\\Users\\sathabet\\IdeaProjects\\Discount management\\BootReservation\\src\\main\\resources\\discountCsv.csv";
        String line;
        String csvSplitBy = ",";

        CSVReader reader = new CSVReader(new FileReader(csvFile));
        String[] nextLine;
        System.out.print("   Boot Type  "+   "Discount Rate  "+ "       Start Day  " + "          End day   "+ "\n" );

        while ((nextLine = reader.readNext()) != null) {

            System.out.print("       " + nextLine[0] + "               " + nextLine[1] + "          " + nextLine[2] + "          " + nextLine[3] + "\n");
        }
        reader.close();

        System.out.print("Please Enter the Boat Type : ");
        String boatType1 = scanner.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
             FileWriter fw = new FileWriter(csvFile + ".tmp", true)) {
            while ((line = br.readLine()) != null) {
                String[] discountInfo = line.split(csvSplitBy);
                if (!boatType1.isEmpty() && discountInfo[0].equals(boatType1)) {

                    System.out.println("Current discount information: " + line);

                    System.out.print("Boat Type : ");
                    String boatType = scanner.nextLine();

                    System.out.print("Discount Rate: ");
                    discount.setDiscountRate(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.print("Start Date (YYYY-MM-DD): ");
                    String startDate = scanner.nextLine();
                    discount.setStartDate(LocalDate.parse(startDate));
                    scanner.nextLine();
                    System.out.print("End Date (YYYY-MM-DD): ");
                    String endDate = scanner.nextLine();
                    discount.setEndDate(LocalDate.parse(endDate));
                    scanner.nextLine();
                    scanner.close();

                    String[] updatedDiscountInfo = new String[]{ boatType, String.valueOf(discount.getDiscountRate()),String.valueOf(startDate), String.valueOf(endDate) };
                    fw.write(String.join(csvSplitBy, updatedDiscountInfo) + "\n");
                    System.out.println("Discount updated successfully");
                } else {
                    fw.write(line + "\n");
                }
            }
        }


               catch (IOException e) {

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

