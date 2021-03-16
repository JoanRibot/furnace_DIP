package edu.pong;

public class GasHeater implements Heater{

    @Override
    public void engaged(RoomTemperature temperature) {
        temperature.incrementTemperature(+1);
    }

    @Override
    public void disengaged(RoomTemperature temperature) {
        temperature.incrementTemperature(-1);

    }
    
}
