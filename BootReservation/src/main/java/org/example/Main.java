package org.example;

import view.DiscountCreate;
import control.DiscountMenu;

import java.io.IOException;
import java.text.ParseException;

import com.opencsv.exceptions.CsvException;

import static control.DiscountMenu.view;

public class Main {
    public static void main(String[] args) throws IOException, ParseException, CsvException {
        DiscountMenu.view();


    }
}
