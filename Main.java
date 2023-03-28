package org.example;


import org.example.model.Boat;
import org.example.model.BoatType;
import org.example.model.Boats;
import org.example.model.BoatsTypes;

public class Main {

    public static void main(String[] args)  {

        Boats boats = new Boats();
        boats.read();

        for (Boat boat: boats.list)
            System.out.println(boat);

        BoatsTypes boatsTypes = new BoatsTypes();
        boatsTypes.read();
        for(BoatType boatType : boatsTypes.list)
            System.out.println(boatType);



    }
}



