package control;

import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import model.Discount;
import view.DiscountCreate;
import view.DiscountDelete;
import view.DiscountUpdate;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class DiscountMenu {

    public static void view() throws IOException, ParseException, CsvException {
        while (true) {
            System.out.println("Menu");
            System.out.println("____________________________________");
            System.out.println("1. Discount Create");
            System.out.println("2. Discount Update ");
            System.out.println("3. Discount Delete");
            System.out.println("9. Exit");

            System.out.println();
            System.out.print("Make your choice: ");

            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();

            boolean exit = false;
            switch (s.charAt(0)) {

                case '1':
                    Discount discount = DiscountCreate.view();
                    break;
                case '2':

                    if (DiscountUpdate.view()) {
                        ;
                    }
                    // @ToDo next menu
                    break;
                case '3':
                    if (DiscountDelete.remove()) {
                        ;
                    }
                    // @ToDo next menu
                    break;
                case '9':

                    return;

                default:
                    System.out.println("input not valid try again ...");
            }
        }
    }
}
