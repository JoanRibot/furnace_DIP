package edu.pong;

public class Regulator {

    void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature){

        RegulatorDisplayCodes code;
        while (t.read(temperature) < maxTemp) {
			code = RegulatorDisplayCodes.HEATING;
			h.engage(temperature);
			message(code, temperature);
		}
		while (t.read(temperature) > minTemp) {
			code = RegulatorDisplayCodes.WAITING;
			h.disengage(temperature);
			message(code, temperature);
		}
    }

    private void message(RegulatorDisplayCodes code, RoomTemperature temperature) {
        switch (code) {
			case HEATING:
			System.out.println("Calentando, temperatura:" + temperature.getTemperature());
				break;
			case WAITING:
				System.out.println("Apagando, temperatura:" + temperature.getTemperature());
				break;
			default:
				System.out.println("No funciona correctamente.");
				break;
		}
	}
    
}
