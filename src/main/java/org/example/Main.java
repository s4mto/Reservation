package org.example;

import org.example.model.Accounts;
import org.example.menu.ReservationController;

public class Main {
    public static void main(String[] args) {
        // @ToDo read all data from disk

        Accounts accounts = new Accounts();
        //LoginMenu.view(accounts);
        ReservationController.selection();


    }
}