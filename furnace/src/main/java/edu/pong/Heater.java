package edu.pong;

public interface Heater {
    
    void engage(RoomTemperature temperature);

    void disengage(RoomTemperature temperature);
       
}
