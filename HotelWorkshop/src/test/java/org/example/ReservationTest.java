package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    public void IfKing_Return139(){
        Reservation reservation = new Reservation("king",2,true);

        var result = reservation.getPrice();

        assertEquals(139,result);
    }

    @Test
    public void Double_Return124(){
        Reservation reservation = new Reservation("double",2,true);

        var result = reservation.getPrice();

        assertEquals(124,result);
    }

    @Test
    public void IfNumberOfNights_ReturnExactNumber(){
        Reservation reservation = new Reservation("double",2,true);

        var result = reservation.getNumberOfNights();

        assertEquals(2,result);
    }

    @Test
    public void IfWeekend_ReturnTrue(){
        Reservation reservation = new Reservation("double",2,true);

        var result = reservation.isWeekend();

        assertTrue(result);
    }

    @Test
    public void IfNotWeekend_ReturnFalse(){
        Reservation reservation = new Reservation("double",2,false);

        var result = reservation.isWeekend();

        assertFalse(result);
    }

    @Test
    public void IfKingAnd2NightsIsWeekend_Return305_8(){
        Reservation reservation = new Reservation("king",2,true);

        var result = reservation.getReservationTotal();

        assertEquals(305.8,result);
    }
}