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
}
