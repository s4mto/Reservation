package org.example.model;

public class Reservation {
    private String reservationId;
    private String boatType;
    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private int numOfPeople;
    private String infoOfPeople;
    private String cost;


//    public MakeReservation(String reservationId, String startDate, String endDate,
//                           String startTime, String endTime,int numOfPeople, String infoOfPeople) {
//        this.name = name;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.startTime = startTime;
//        this.endTime = endTime;
//        this.numOfPeople = numOfPeople;
//        this.infoOfPeople = infoOfPeople;
//    }

    // getters and setters

    public String getReservationId() {return reservationId;}

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getBoatType() {return boatType;}

    public void setBoatType(String boatType) {this.boatType = boatType;}

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public String getInfoOfPeople() {
        return infoOfPeople;
    }

    public void setInfoOfPeople(String infoOfPeople) {
        this.infoOfPeople = infoOfPeople;
    }

    public String getCost() {return cost;}

    public void setCost(String cost) {this.cost = cost;}
}
