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
}