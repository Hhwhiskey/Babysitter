package Test;

import com.kevinhodges.Babysitter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by Kevin on 2/18/2016.
 */
public class BabysitterTest {

    private Babysitter babysitter;

    @Before
    public void setUp(){
        babysitter = new Babysitter();
    }

    @Test
    public void testDayRate() {
        int result = babysitter.getDayRate();
        assertEquals(12, result);
    }

    @Test
    public void testNightRate() {
        int result = babysitter.getNightRate();
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
}
