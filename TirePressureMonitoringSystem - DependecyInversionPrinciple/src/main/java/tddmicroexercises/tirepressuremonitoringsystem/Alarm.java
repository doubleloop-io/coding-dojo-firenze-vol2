package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm {
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    private final PressureReader sensor;

    public Alarm(PressureReader sensor) {
        this.sensor = sensor;
    }

    boolean alarmOn = false;

    public void check() {
        double psiPressureValue = sensor.readNextValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue) {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }
}
