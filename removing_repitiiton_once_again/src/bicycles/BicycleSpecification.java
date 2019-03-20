package bicycles;

public class BicycleSpecification {
    private int accelerationSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    private int brakeSpeed;

    public int getBrakeSpeed(){
        return brakeSpeed;
    }

}
