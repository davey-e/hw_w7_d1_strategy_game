import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CannonTest {

    Cannon cannon;
    Tank tank;

    @Before
    public void before(){
        cannon = new Cannon("Cannon", 1000, 50);
        tank = new Tank("Bobby", 2000, 50, 2);
    }

    @Test
    public void hasType(){
        assertEquals("Cannon", cannon.getType());
    }

    @Test
    public void canAttack(){
        cannon.attack(tank);
        assertEquals(1950, tank.getHealthValue());
    }
}
