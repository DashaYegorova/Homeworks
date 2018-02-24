package lesson11;

public class SportCar extends Car {
    private int speed;

    public SportCar(String model, String carClass, int weight, Driver driver, Engine engine, int speed) {
        super(model, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
