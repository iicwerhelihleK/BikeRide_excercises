package bicycles;

public interface Bicycle {

    void accelerate();

    void brake();

    int currentSpeed();

    void stop();
}

/*public class Bicycle {
    int speed = 0;
    public void accelerate() {
        speed = speed + 5;
    }

    public void brake() {
        speed = speed - 3;
    }

    public int currentSpeed() {
        return speed;
    }

    public void stop() {
        speed = 0;
    }
}
*/


