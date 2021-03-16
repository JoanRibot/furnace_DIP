package edu.pong;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JediTest {
    @Test
    public void engageTest(){
        RoomTemperature temperature = new RoomTemperature(10);
        Jedi yoda = new Jedi();

        yoda.engage(temperature);

        assertEquals(1410, temperature.getTemperature(),0);
    }

    @Test
    public void disengageTest(){
        RoomTemperature temperature = new RoomTemperature(1410);
        Jedi yoda = new Jedi();

        yoda.disengage(temperature);

        assertEquals(10, temperature.getTemperature(),0);
    }
}
