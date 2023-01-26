package at.xxx.examples.cars;

public class Engine {
    private int maximumSpeed;
    private String motorType;

    public Engine(int maximumSpeed, String motorType) {
        this.maximumSpeed = maximumSpeed;
        this.motorType = motorType;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
}
