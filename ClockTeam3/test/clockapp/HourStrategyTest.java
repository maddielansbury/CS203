package clockapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author george
 */
public class HourStrategyTest {
    
    TimeStrategy instance;
    TimeModel tm;
    ClockView cv;
    
    public HourStrategyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tm = new TimeModel();
        cv = new ClockView();
        
        instance = new HourStrategy(cv);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of clockTick method, of class LockStrategy.
     */
    @Test
    public void testClockTick() {
        System.out.println("clockTick");
        instance.clockTick(tm);
        assertEquals(0, tm.getHour());
    }

    /**
     * Test of upExecute method, of class LockStrategy.
     */
    @Test
    public void testUpExecute() {
        System.out.println("upExecute");
        instance.upExecute(tm);
        assertEquals(1, tm.getHour());
        instance.upExecute(tm);
        assertEquals(2, tm.getHour());
    }

    /**
     * Test of downExecute method, of class LockStrategy.
     */
    @Test
    public void testDownExecute() {
        System.out.println("downExecute");
        instance.downExecute(tm);
        assertEquals(23, tm.getHour());
        instance.downExecute(tm);
        assertEquals(22, tm.getHour());
    }
    
}
