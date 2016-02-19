package Test;

import com.kevinhodges.Babysitter;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kevin on 2/18/2016.
 */
public class BabysitterTest {

    private Babysitter babysitter;
    private SimpleDateFormat format;

    @Before
    public void setUp() {
        // Commonly used field variables in the setUp to clean up the tests
        babysitter = new Babysitter();
        format = new SimpleDateFormat("HH");
    }

    @Test
    public void testDayRate() {
        int result = babysitter.getDayRate();
        assertEquals(12, result);
    }

    @Test
    public void testAfterBedRate() {
        int result = babysitter.getAfterBedRate();
        assertEquals(8, result);
    }

    @Test
    public void testLateRate() {
        int result = babysitter.getLateRate();
        assertEquals(16, result);
    }

    @Test
    public void testShiftLengthMax() {
        int result = babysitter.getShiftLengthMax();
        assertEquals(11, result);
    }

    @Test
    public void testShiftLengthMin() {
        int result = babysitter.getShiftLengthMin();
        assertEquals(1, result);
    }

    @Test
    public void testCalculateShiftLength() {

        // Pass in shift start time of 1700 on feb 19th
        Calendar shiftStartDate = Calendar.getInstance();
        shiftStartDate.set(2016, 2, 19, 17, 0, 0);
        long shiftStartTime = shiftStartDate.getTimeInMillis();

        // Pass in shift end time of 0400 on feb 20th
        Calendar shiftEndDate = Calendar.getInstance();
        shiftEndDate.set(2016, 2, 20, 04, 0, 0);
        long shiftEndTime = shiftEndDate.getTimeInMillis();

        // We expect this situation to return a shift length of 11 hours
        // the max shift length
        int result = babysitter.calculateShiftLength(shiftStartTime, shiftEndTime);
        assertEquals(11, result);
    }
}
