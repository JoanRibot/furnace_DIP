package edu.pong;

public class RoomTemperature {
    private double temperature;

    RoomTemperature(double temperature){
        this.temperature = temperature;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void incrementTemperature(double increment){
        this.temperature += increment;
    }
}
