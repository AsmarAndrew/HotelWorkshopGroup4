package org.example;

public class Reservation {

    private String roomType;
    private double numberOfNights;
    private double price;
    private boolean IsWeekend;

    public Reservation(String roomType, double numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        IsWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(double numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")){
            price = 139;
        }
        if (roomType.equalsIgnoreCase("double")){
            price = 124;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWeekend() {
        return IsWeekend;
    }

    public void setWeekend(boolean weekend) {
        IsWeekend = weekend;
    }

    public double getReservationTotal(){
        double roomPrice = getPrice();
        if (isWeekend()){
            return ((roomPrice*1.1)*numberOfNights);
        }
        return (roomPrice*numberOfNights);
    }
}