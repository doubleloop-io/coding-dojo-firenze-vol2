package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestAlarm {

    @Test
    public void initialState() {
        Alarm alarm = new Alarm();
        assertThat(alarm.isAlarmOn(), is(false));
    }

    @Test
    public void goodPressure() {
        final int between17and21 = 20;
        Alarm alarm = new Alarm();
        alarm.check(between17and21);
        assertThat(alarm.isAlarmOn(), is(false));
    }

    @Test
    public void goodButOnLimit() {
        final int between17and21 = 21;
        Alarm alarm = new Alarm();
        alarm.check(between17and21);
        assertThat(alarm.isAlarmOn(), is(false));
    }

    @Test
    public void tooLowPressure() {
        final int lessThan17 = 2;
        Alarm alarm = new Alarm();
        alarm.check(lessThan17);
        assertThat(alarm.isAlarmOn(), is(true));
    }

    @Test
    public void tooHighPressure() {
        final int greaterThan21 = 222222;
        Alarm alarm = new Alarm();
        alarm.check(greaterThan21);
        assertThat(alarm.isAlarmOn(), is(true));
    }
}
