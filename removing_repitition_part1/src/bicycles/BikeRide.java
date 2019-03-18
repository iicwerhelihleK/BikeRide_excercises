package bicycles;

public class BikeRide {

    private Bicycle bicycle;

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }


    public BikeRide (Bicycle bicycle){
        this.bicycle = bicycle;

    }

    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }
}


