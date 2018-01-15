import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;

    @Before
    public void before(){
        tank = new Tank("Bobby", 2000, 200);
    }

    @Test
    public void hasName(){
        assertEquals("Bobby", tank.getName());
    }

}
