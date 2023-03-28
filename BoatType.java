package org.example.model;

public class BoatType {
    int typeId;
    int Capacity;
    int Chargingtime;
    int Price;

    public BoatType() {
        this.typeId = typeId;
        int Capacity ;
       int  Chargingtime ;
       int Price ;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public int getChargingtime() {
        return Chargingtime;
    }

    public void setChargingtime(int chargingtime) {
        Chargingtime = chargingtime;
    }

    public int getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "BoatType{" +
                "typeId=" + typeId +
                ", Capacity=" + Capacity +
                ", Chargingtime=" + Chargingtime +
                ", Price=" + Price +
                '}';
    }

    public void setPrice(int price) {
        Price = price;
    }
}
