package org.example.model;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> users = new ArrayList<>();

    public void add(User user) {
        users.add(user);
    }

    public List<User> getUsers() {

        return users;
    }

    public Users() {
        File file = new File("src/main/resources/UserDB");

        // @ToDO read from CSV or in static function

    }

    public int nextUserId() {
        int highest = 0;
        for (User user : users)
            if (user.getUserId() > highest)
                highest = user.getUserId();
        return highest + 1;
    }

    public static Users readCSV() {
        Users list = new Users();

        try {
            String csvFile = "src/main/resources/UserDB";
            CSVReader reader = null;

            reader = new CSVReader(new FileReader(csvFile));

            String[] fields;
            boolean firstLine = true;
            while ((fields = reader.readNext()) != null) {
                if (!firstLine)
                    list.add(User.readCSV(fields));
                firstLine = false;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static Users writeCSV(Users users) {
        try {
            PrintWriter writer = new PrintWriter(new File("src/main/resources/UserDB"));
//            model.getUsers().add(newUser);
            for (User user : users.getUsers()) {
                writer.println(user.getUserId() + "," +
                        user.getFirstName() + "," +
                        user.getLastName() + "," +
                        user.getEmail() + "," +
                        user.getPassword() + "," +
                        user.getPhoneNumber() + "," +
                        user.getAddress() + "," +
                        user.getRole() + "," +
                        user.isGuest());
            }
            writer.close();
            System.out.println("New user successfully added.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the CSV file: " + e.getMessage());
        }
        return users;
    }

}