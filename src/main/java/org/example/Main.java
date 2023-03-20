package org.example;

import org.example.menu.LoginMenu;
import org.example.model.Accounts;

public class Main {
    public static void main(String[] args) {
        // @ToDo read all data from disk

        Accounts accounts = new Accounts();

        LoginMenu.view(accounts);

    }
}