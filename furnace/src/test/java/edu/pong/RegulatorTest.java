package edu.pong;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RegulatorTest {
    @Test
    public void regulateTest(){
        Thermometer thermometer = new RemoteCommandSensor();
        Heater heater = new GasHeater();
        RoomTemperature temperature = new RoomTemperature(10);
        double minTemp = 2;
        double maxTemp = 16;
        Regulator regulator = new Regulator();

        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        assertEquals(2, thermometer.read(temperature),0);

    }
}
