package tddmicroexercises.tirepressuremonitoringsystem;

public class StubPressureReader implements PressureReader {

    private final int pressure;

    public StubPressureReader(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public double readNextValue() {
        return pressure;
    }
}
