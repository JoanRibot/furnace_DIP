package edu.pong;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GasHeaderTest {
    @Test
    public void gasHeaderEngageTest(){
        Heater heater = new GasHeater();
        RoomTemperature temperature = new RoomTemperature(10);
        heater.engage(temperature);
        heater.engage(temperature);

        assertEquals(12,temperature.getTemperature(),0);

    }

    @Test
    public void gasHeaderDisengageTest(){
        Heater heater = new GasHeater();
        RoomTemperature temperature = new RoomTemperature(10);
        heater.disengage(temperature);
        heater.disengage(temperature);

        assertEquals(8,temperature.getTemperature(),0);

    }
}
