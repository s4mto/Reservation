package org.example.model;

import java.io.FileWriter;
import java.io.IOException;

public class user {
    private String username;
    private String password;
    private String email;

    public user(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void writeToCSV() {
        try {
            FileWriter fileWriter = new FileWriter("user_accounts.csv");


            // write headers
            String[] headers = {"username", "password", "email"};


            // write user account information
            String[] data = {username, password, email};
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

