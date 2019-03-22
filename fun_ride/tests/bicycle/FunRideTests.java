package bicycle;

import bicycles.*;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTests {
    @Test
    public void howManyMountainBikes(){
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification tandem = new BicycleSpecification(12, -7, BicycleType.Tandem);


        Bicycle bicycle = new BicycleFromSpec(mountainBike);
        Bicycle bicycle2 = new BicycleFromSpec(roadBike);
        Bicycle bicycle3 = new BicycleFromSpec(tandem);

        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);

        FunRide funRide = new FunRide(3);
        funRide.acceptMethod(bicycle);
        assertEquals(1, funRide.getEnteredCount());
    }



    @Test
    public void howManyRoadBikes(){
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification tandem = new BicycleSpecification(12, -7, BicycleType.Tandem);


        Bicycle bicycle = new BicycleFromSpec(mountainBike);
        Bicycle bicycle2 = new BicycleFromSpec(roadBike);
        Bicycle bicycle3 = new BicycleFromSpec(tandem);

        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);

        FunRide funRide = new FunRide(20);
        funRide.acceptMethod(bicycle);
        assertEquals(1, funRide.getEnteredCount());
    }

    @Test
    public void howManyTandemBikes(){
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification tandem = new BicycleSpecification(12, -7, BicycleType.Tandem);


        Bicycle bicycle = new BicycleFromSpec(mountainBike);
        Bicycle bicycle2 = new BicycleFromSpec(roadBike);
        Bicycle bicycle3 = new BicycleFromSpec(tandem);

        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);

        FunRide funRide = new FunRide(10);
        funRide.acceptMethod(bicycle);
        assertEquals(1, funRide.getEnteredCount());
    }

}
