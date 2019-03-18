package bicycles.rides;

import bicycles.Bicycle;
import bicycles.rides.BikeRide;

public class BikeRideOne implements BikeRide {

    private Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle1){
        this.bicycle = bicycle1;
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();


    }

    @Override
    public int currentSpeed() {
        return bicycle.currentSpeed();
    }
}
