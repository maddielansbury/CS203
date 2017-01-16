package clockapp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TimeModelTest {
    
    private TimeModel timeModel = null;
    
    public TimeModelTest() {
    }
    
    @Before
    public void setUpClass() {
        timeModel = new TimeModel();
    }

    /**
     * Test of tick method, of class TimeModel.
     */
    @org.junit.Test
    public void testTick() {
        System.out.println("tick");
        timeModel.tick();
        assertEquals(timeModel.getSecond(), 1);
    }

    /**
     * Test of addHour method, of class TimeModel.
     */
    @org.junit.Test
    public void testAddHour() {
        System.out.println("addHour");
        int h = 3;
        int expResult = 3;
        timeModel.addHour(h);
        int result = timeModel.getHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of addMinute method, of class TimeModel.
     */
    @org.junit.Test
    public void testAddMinute() {
        System.out.println("addMinute");
        int m = 20;
        int expResult = 20;
        timeModel.addMinute(m);
        int result = timeModel.getMinute();
        assertEquals(expResult, result);
    }

    /**
     * Test of addSecond method, of class TimeModel.
     */
    @org.junit.Test
    public void testAddSecond() {
        System.out.println("addSecond");
        int s = 61;
        int expResult = 1;
        timeModel.addSecond(s);
        int result = timeModel.getSecond();
        assertEquals(expResult, result);
    }

}
