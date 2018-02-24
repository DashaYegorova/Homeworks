package lesson11;

public class Car {
    private String model;
    private String carClass;
    private int weight;
    Driver driver = new Driver();
    Engine engine = new Engine();

    public Car(String model, String carClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    void start() {
        System.out.println("Start!");
    }

    void stop() {
        System.out.println("Stop!");
    }

    void turnLeft() {
        System.out.println("Turn left!");
    }

    void turnRight() {
        System.out.println("Turn right!");
    }

    void printInfo() {
        System.out.println(this.getModel() + " " + this.getClass() + " " + this.getWeight() + " " +
                this.getDriver() + " " + this.getEngine());
    }
}
