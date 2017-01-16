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
public class LockStrategyTest {
    
    TimeStrategy instance;
    TimeModel tm;
    ClockView cv;
    
    public LockStrategyTest() {
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
        instance = new LockStrategy(cv);
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
        assertEquals(1, tm.getSecond());
    }

    /**
     * Test of upExecute method, of class LockStrategy.
     */
    @Test
    public void testUpExecute() {
        System.out.println("upExecute");
        instance.upExecute(tm);
        assertEquals(0, tm.getSecond());
        instance.upExecute(tm);
        assertEquals(0, tm.getSecond());
    }

    /**
     * Test of downExecute method, of class LockStrategy.
     */
    @Test
    public void testDownExecute() {
        System.out.println("downExecute");
        instance.downExecute(tm);
        assertEquals(0, tm.getSecond());
        instance.downExecute(tm);
        assertEquals(0, tm.getSecond());
    }
    
}
