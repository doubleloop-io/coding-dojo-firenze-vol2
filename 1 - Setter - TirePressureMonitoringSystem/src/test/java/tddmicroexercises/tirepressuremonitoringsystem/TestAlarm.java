package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestAlarm {

    @Test
    public void initialState() {
        final StubSensor sensor = new StubSensor(0);
        Alarm alarm = new Alarm();
        alarm.setSensor(sensor);
        assertThat(alarm.isAlarmOn(), is(false));
    }

    @Test
    public void goodPressure() {
        final int between17and21 = 20;
        final StubSensor sensor = new StubSensor(between17and21);
        Alarm alarm = new Alarm();
        alarm.setSensor(sensor);
        alarm.check();
        assertThat(alarm.isAlarmOn(), is(false));
    }

    @Test
    public void goodButOnLimit() {
        final int between17and21 = 21;
        final StubSensor sensor = new StubSensor(between17and21);
        Alarm alarm = new Alarm();
        alarm.setSensor(sensor);
        alarm.check();
        assertThat(alarm.isAlarmOn(), is(false));
    }

    @Test
    public void tooLowPressure() {
        final int lessThan17 = 2;
        final StubSensor sensor = new StubSensor(lessThan17);
        Alarm alarm = new Alarm();
        alarm.setSensor(sensor);
        alarm.check();
        assertThat(alarm.isAlarmOn(), is(true));
    }

    @Test
    public void tooHighPressure() {
        final int greaterThan21 = 222;
        final StubSensor sensor = new StubSensor(greaterThan21);
        Alarm alarm = new Alarm();
        alarm.setSensor(sensor);
        alarm.check();
        assertThat(alarm.isAlarmOn(), is(true));
    }
}
