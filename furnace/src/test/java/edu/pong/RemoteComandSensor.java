package edu.pong;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoteComandSensor {
    
    @Test
    public void RemoteComandSensorTest(){
        RoomTemperature temperature = new RoomTemperature(10);
        RoomTemperature temperature2 = new RoomTemperature(0);
        Thermometer thermometer = new RemoteCommandSensor();
        
        assertEquals(10, thermometer.read(temperature),0);
        assertEquals(0, thermometer.read(temperature2),0);

    }
}
