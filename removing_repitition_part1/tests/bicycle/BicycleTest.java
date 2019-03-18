package bicycle;


import bicycles.Bicycle;
import bicycles.BikeRide;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void BikeRide() {
        //Bicycle bicycle =  new Bicycle();
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();
        Tandem tandem = new Tandem();

        BikeRide bikeRide = new BikeRide(mountainBike);
        BikeRide bikeRide2 = new BikeRide(roadBike);
        BikeRide bikeRide3 = new BikeRide(tandem);

        bikeRide.ride();
        bikeRide2.ride();
        bikeRide3.ride();

        //System.out.println(bikeRide.currentSpeed());
        assertEquals(mountainBike.currentSpeed(), 14);
        assertEquals(roadBike.currentSpeed(),  36);
        assertEquals(roadBike.currentSpeed(),36);


    }


}

