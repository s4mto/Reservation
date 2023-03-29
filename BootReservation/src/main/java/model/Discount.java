package model;

import java.time.LocalDate;

public class Discount {
     int typeId;
    private int discountId;
    private double discountRate ; // percentage
    private LocalDate startDate;
    private LocalDate endDate;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }





    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Discount(int typeId, int discountId, double discountRate,  LocalDate startDate, LocalDate endDate) {
        this.typeId = typeId;
        this.discountId = discountId;
        this.discountRate = discountRate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Discount() {
    }

    public String toString() {
        return "typeId=" + typeId +
                ", discountId=" + discountId +
                ", discountRate=" + discountRate +
                ", start_date=" + startDate +
                ", end_data=" + endDate;
    }




}

