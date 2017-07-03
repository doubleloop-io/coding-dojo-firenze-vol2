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
    public void goodPressure() throws Exception {
        final int between17and21 = 19;
        final Alarm alarm = new TestableAlarm(between17and21);
        alarm.check();
        assertThat(alarm.isAlarmOn(), is(false));
    }

    @Test
    public void goodButOnLimit() throws Exception {
        final int between17and21 = 17;
        final Alarm alarm = new TestableAlarm(between17and21);
        alarm.check();
        assertThat(alarm.isAlarmOn(), is(false));
    }

    @Test
    public void tooLowPressure() throws Exception {
        final int lessThan17 = 14;
        final Alarm alarm = new TestableAlarm(lessThan17);
        alarm.check();
        assertThat(alarm.isAlarmOn(), is(true));
    }

    @Test
    public void tooHighPressure() throws Exception {
        final int greaterThan21 = 27;
        final Alarm alarm = new TestableAlarm(greaterThan21);
        alarm.check();
        assertThat(alarm.isAlarmOn(), is(true));
    }
}
