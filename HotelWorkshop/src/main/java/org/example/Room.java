package org.example;

public class Room {
    public int numberOfBeds;
    public double price;
    public boolean occupied;
    public boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        if (!isDirty() && !isOccupied()){
            return true;
        }
        return false;
    }

    public boolean checkIn() {
        if(!occupied && !dirty) {
            occupied = true;
            dirty = true;
            return true;
        }
        else {
            return false;
        }

    }

    public boolean checkOut() {
        if (occupied) {
            occupied = false;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean cleanRoom() {
        if (dirty) {
            dirty = false;
            return true;
        }
        else {
            return false;
        }
    }

}
