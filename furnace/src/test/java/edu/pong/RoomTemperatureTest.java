package edu.pong;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoomTemperatureTest {
    
    @Test
    public void testSetTemperature(){
        RoomTemperature temperature = new RoomTemperature(10);
        RoomTemperature temperature2 = new RoomTemperature(0);

        temperature.setTemperature(13);
        assertEquals(13, temperature.getTemperature(),0);

        temperature2.setTemperature(18);
        assertEquals(18, temperature2.getTemperature(),0);
    }

    @Test
    public void testIncrementTemperature(){
        RoomTemperature temperature = new RoomTemperature(10);
        RoomTemperature temperature2 = new RoomTemperature(0);

        temperature.incrementTemperature(3);
        assertEquals(13, temperature.getTemperature(),0);

        temperature2.incrementTemperature(4);
        assertEquals(4, temperature2.getTemperature(),0);
    }
}
