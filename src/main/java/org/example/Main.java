package org.example;


import com.opencsv.exceptions.CsvException;
import org.example.menu.LoginMenu;
import org.example.model.Account;

import org.example.model.Accounts;
import org.example.menu.ReservationController;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException, CsvException {

        Accounts accounts = new Accounts();

        Account account = new Account();
        account.userName = "test";
        account.Password = "test";
        account.setRole("Manager");
        accounts.list.add(account);

        LoginMenu.view(accounts);
        //ReservationController.selection();



    }
}

//import view.DiscountCreate;
//        import control.DiscountMenu;
//
//        import java.io.IOException;
//        import java.text.ParseException;
//
//        import com.opencsv.exceptions.CsvException;
//
//        import static control.DiscountMenu.view;
//
//public class Main {
//    public static void main(String[] args) throws IOException, ParseException, CsvException {
//        DiscountMenu.view();
//
//
//    }
//}