package org.example.model;

public class Model {
    public BoatType boatTypeList;
    public Boats boats;
    public BoatType boatType;
    public Users users;
    public Roles roles;

    public Model() {
        users = Users.readCSV();
//        roles = Roles.readCSV()

     //   Boats boatList = Boats.read();


    }
}