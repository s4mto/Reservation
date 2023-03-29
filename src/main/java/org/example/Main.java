package org.example;


import org.example.menu.LoginMenu;
import org.example.model.Account;

import org.example.model.Accounts;
import org.example.menu.ReservationController;

public class Main {
    public static void main(String[] args) {

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