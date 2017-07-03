package tddmicroexercises.tirepressuremonitoringsystem;

public class StubSensor extends Sensor {

    private final int pressure;

    public StubSensor(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public double popNextPressurePsiValue() {
        return pressure;
    }
}
