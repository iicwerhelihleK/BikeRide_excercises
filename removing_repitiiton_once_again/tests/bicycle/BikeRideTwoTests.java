package bicycle;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTests {
    @Test
    public void mountainBikeTestTwo(){
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo everywhere = new BikeRideTwo(mountainBike);
        everywhere.ride();
        assertEquals(8, everywhere.currentSpeed());
    }



    @Test
    public void roadBikeTestTwo(){
        RoadBike roadBike = new RoadBike();
        BikeRideTwo there = new BikeRideTwo(roadBike);
        there.ride();
        assertEquals(28, there.currentSpeed());
    }

    @Test
    public void tandemTestTwo(){
        Tandem tandem = new Tandem();
        BikeRideTwo too = new BikeRideTwo(tandem);
        too.ride();
        assertEquals(20, too.currentSpeed());
    }

}
