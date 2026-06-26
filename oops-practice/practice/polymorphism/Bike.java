public class Bike extends vehicle{



    public Bike(String vehicleNumber){
        super(vehicleNumber);
    }
    @Override
    public double fuelCost(double km){
        return km*3;
    }
} 