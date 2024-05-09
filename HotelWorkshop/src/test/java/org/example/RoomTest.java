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



}