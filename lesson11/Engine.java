package lesson11;

public class Engine {
    private String enginePower;
    private int productivity;

    Engine() {
    }

    public Engine(String enginePower, int productivity) {
        this.enginePower = enginePower;
        this.productivity = productivity;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }
}
