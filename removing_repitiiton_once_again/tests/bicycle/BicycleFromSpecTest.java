package bicycle;

import bicycles.Bicycle;
import bicycles.BicycleFromSpec;
import bicycles.BicycleSpecification;
import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleFromSpecTest {
    @Test
    public void roadBikeSpecTest() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, - 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();
        assertEquals(11, roadBikeSpec.getAccelerationSpeed());
        assertEquals(-4, roadBikeSpec.getBrakeSpeed());

    }

    @Test
    public void mountainBikeSpecTest() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, - 3);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();
        assertEquals(5, mountainBikeSpec.getAccelerationSpeed());
        assertEquals(-3, mountainBikeSpec.getBrakeSpeed());

    }

    @Test
    public void tandemBikeSpecTest() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, - 7);
        Bicycle bicycle = new BicycleFromSpec(tandemBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();
        assertEquals(12, tandemBikeSpec.getAccelerationSpeed());
        assertEquals(-7, tandemBikeSpec.getBrakeSpeed());

    }






}
