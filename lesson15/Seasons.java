package lesson15;

/**
 * Created by Student on 12.03.2018.
 */
public enum Seasons {
    WINTER(0), SPRING(15),
    SUMMER(27){
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    }, AUTUMN(15);

    private double angTemperature;

    Seasons(double angTemperature) {
        this.angTemperature = angTemperature;
    }

    public double getAngTemperature() {
        return angTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
