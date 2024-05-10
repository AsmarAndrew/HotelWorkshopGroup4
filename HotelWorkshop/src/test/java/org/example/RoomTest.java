package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void IfRoomDirty_AndOccupied_ReturnFalse(){
        Room room = new Room(2,3.1,true,true);

        var result = room.isAvailable();

        assertFalse(result);
    }

    @Test
    public void IfRoomDirty_AndNonOccupied_ReturnFalse(){
        Room room = new Room(2,3.1,false,true);

        var result = room.isAvailable();

        assertFalse(result);
    }

    @Test
    public void IfNonRoomDirty_AndNonOccupied_ReturnFalse(){
        Room room = new Room(2,3.1,false,false);

        var result = room.isAvailable();

        assertTrue(result);
    }

    @Test
    public void IfCheckIn_ReturnTrue(){
        Room room = new Room(2,3.1,false,false);

        var result = room.checkIn();

        assertTrue(result);
    }

    @Test
    public void IfCheckIn_ButDirty_ReturnFalse(){
        Room room = new Room(2,3.1,false,true);

        var result = room.checkIn();

        assertFalse(result);
    }

    @Test
    public void IfCheckIn_ButOccupy_ReturnFalse(){
        Room room = new Room(2,3.1,true,false);

        var result = room.checkIn();

        assertFalse(result);
    }

    @Test
    public void IfCheckOut_ButOccupied_ReturnTrue(){
        Room room = new Room(2,3.1,true,true);

        var result = room.checkOut();

        assertTrue(result);
    }

    @Test
    public void IfCleanRoom_ButDirty_ReturnTrue(){
        Room room = new Room(2,3.1,true,true);

        var result = room.checkOut();

        assertTrue(result);
    }

    @Test
    public void IfCheckIn_ButNonOccupy_ReturnTrue(){
        Room room = new Room(2,3.1,false,false);

        var result = room.checkIn();

        assertTrue(result);
    }


}