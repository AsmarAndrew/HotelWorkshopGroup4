package org.example;

import java.util.List;

public class Reservation {
    private String roomType;
    private int price;
    private int numberOfNights;
    private boolean isWeekend;
    //private List<String> room;

    //constructors

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        //calculatePrice();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
//derived
    public int getReservationTotal() {
        return price * numberOfNights;
    }
    //calculate price based on room type and weekend
    private void calculatePrice() {
        if(roomType.equalsIgnoreCase("king")) {
            price = isWeekend ? 139 * 110 / 100 : 139;
        }
        else if (roomType.equalsIgnoreCase("double")){
            price = isWeekend ? 124 * 110 / 100 : 124;
        }
    }


}
