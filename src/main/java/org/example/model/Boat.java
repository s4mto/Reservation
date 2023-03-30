package org.example.model;


public class Boat {
    private String boatId;
    private String boatName;
    private int boatType;

    public Boat(String boatId, String boatName, int boatType) {
        this.boatId = boatId;
        this.boatName = boatName;
        this.boatType = boatType;
    }

    public Boat() {
    }

    public String getBoatId() {
        return boatId;
    }

    public void setBoatId(String boatId) {

        this.boatId = boatId;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public int getBoatType() {
        return boatType;
    }

    public void setBoatType(int boatType) {
        this.boatType = boatType;
    }

    @Override
    public String toString() {
        return "BoatList {" +
                "typeId=" + boatId + ",boatName=" +  boatName + ",boatType=" +   boatType;
    }
}
