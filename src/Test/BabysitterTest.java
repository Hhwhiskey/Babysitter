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

        // We expect this test to return a shift length of 11 hours

        // Set calendar object to time of 1700 on feb 19th
        Calendar shiftStartDate = Calendar.getInstance();
        shiftStartDate.set(Calendar.YEAR, 2016);
        shiftStartDate.set(Calendar.MONTH, 2);
        shiftStartDate.set(Calendar.DATE, 19);
        shiftStartDate.set(Calendar.HOUR_OF_DAY, 17);

        // Set calendar object to time of 0400 on feb 20th
        Calendar shiftEndDate = Calendar.getInstance();
        shiftEndDate.set(Calendar.YEAR, 2016);
        shiftEndDate.set(Calendar.MONTH, 2);
        shiftEndDate.set(Calendar.DATE, 20);
        shiftEndDate.set(Calendar.HOUR_OF_DAY, 4);

        int result = babysitter.calculateShiftLength(shiftStartDate, shiftEndDate);
        assertEquals(11, result);
    }
}
