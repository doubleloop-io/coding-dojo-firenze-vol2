package tddmicroexercises.tirepressuremonitoringsystem;

public class TestableAlarm extends Alarm {

    private final int pressure;

    public TestableAlarm(int pressure) {
        this.pressure = pressure;
    }

    @Override
    protected double nextPsiPressureValue() {
        return pressure;
    }
}
