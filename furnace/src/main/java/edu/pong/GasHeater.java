package edu.pong;

public class GasHeater implements Heater{

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(+1);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.incrementTemperature(-1);

    }
    
}
