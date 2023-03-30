package org.example.view;

import org.example.model.BoatType;
import org.example.model.BoatsTypes;

import java.util.Scanner;

public class BoatTypeCreate {
    public static BoatType view() {
        Scanner scanner = new Scanner(System.in);
        BoatType boatType = new BoatType();

        System.out.print("TypeId: ");
        int TypeId = scanner.nextInt();
        boatType.setTypeId(TypeId);

        System.out.print("Capacity: ");
        int Capacity = scanner.nextInt();
        boatType.setCapacity(Capacity);
        scanner.nextLine();
        System.out.print("Chargingtime: ");
        int Chargingtime = scanner.nextInt();
        boatType.setChargingtime(Chargingtime);
        System.out.print("price: ");
        int price = scanner.nextInt();
        boatType.setPrice(price);
        scanner.close();

        return boatType;
    }


}
