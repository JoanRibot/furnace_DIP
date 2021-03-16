package edu.pong;

public class Jedi implements Heater {

    @Override
    public void engage(RoomTemperature temperature){
        temperature.incrementTemperature(this.toucheLightSable());
   }

   @Override
   public void disengage(RoomTemperature temperature){
        temperature.incrementTemperature(-1400);
}
   
   private double toucheLightSable(){
       final double lightSableTemperature = 1400; 
       return lightSableTemperature;
   }
   
   public void speak(){
   System.out.println("\n"
           + "\t  __.-._   \n"
           + "\t  '-._\"7' \n"
           + "\t   /'.-c   \n"
           + "\t   |  /T   \n"
           + "\t  _)_/LI   \n"
           + "\nDo or do not. There is no try ");
   }
}
