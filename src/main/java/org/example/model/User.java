package org.example.model;

public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int phoneNumber;
    private String address;
    private String role;
    private boolean guest;


    public User(int userId, String firstName, String lastName, String email, String password, int phoneNumber, String address, String role, boolean guest) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.role = role;
        this.guest = guest;
    }

    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isGuest() {
        return guest;
    }

    public void setGuest(boolean guest) {
        this.guest = guest;
    }
    public static User readCSV(String[] fields) {
        int userId = Integer.parseInt(fields[0].trim());
        String firstName = fields[1].trim();
        String lastName = fields[2].trim();
        String email = fields[3].trim();
        String password  = fields[4].trim();
        int phoneNumber = Integer.parseInt(fields[0].trim());
        String address = fields[6].trim();
        String role  = fields[7].trim();
        boolean guest = Boolean.parseBoolean(fields[0].trim());

        return new User(userId, firstName, lastName, email, password, phoneNumber, address, role, guest);
    }
}
