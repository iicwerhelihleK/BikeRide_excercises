package bicycle;


import bicycles.Bicycle;
import bicycles.BikeRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void BikeRide() {
        Bicycle bicycle =  new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();

        //System.out.println(bikeRide.currentSpeed());
        assertEquals(bicycle.currentSpeed(), 14);

    }


}

