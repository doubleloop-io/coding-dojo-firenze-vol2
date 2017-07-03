package tddmicroexercises.tirepressuremonitoringsystem;

public class PhisicalPressureReader implements PressureReader {

    private final Sensor sensor;

    public PhisicalPressureReader() {
        sensor = new Sensor();
    }

    @Override
    public double readNextValue() {
        return sensor.popNextPressurePsiValue();
    }
}
