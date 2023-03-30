package org.example.view;

import model.Discount;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//this class in view packag

public class DiscountCreate {

    public static Discount view() throws ParseException

    {
       DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

        Discount discount = new Discount();
        Scanner scanner = new Scanner(System.in);
        LocalDate now = LocalDate.now();
        String csvHeader = "discountID, discountRate, startDate ,endData \n";

        System.out.println("Creat Discount");
        System.out.println("================================");

        System.out.print("Boat Id : ");
        discount.setDiscountId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Discount Rate :");
        discount.setDiscountRate(scanner.nextDouble());
        scanner.nextLine();


        System.out.print("Start Date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        discount.setStartDate(LocalDate.parse(startDate));
        //scanner.nextLine();
        System.out.print("End Date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();
        discount.setEndDate(LocalDate.parse(endDate));
        scanner.close();




        String filename = "src/main/java/org/example/model/discountCsv.csv";
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.append(String.valueOf(discount.getDiscountId()))
                    .append(",")
                    .append(String.valueOf(discount.getDiscountRate()))
                    .append(",")
                    .append(String.valueOf(discount.getStartDate()))
                    .append(",")
                    .append(String.valueOf(discount.getEndDate()))
                    .append(",")
                    .append("\n");
            writer.flush();
            writer.close();
            System.out.println("Discount data saved!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        return discount;
    }

}

