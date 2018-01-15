import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    Cannon cannon;

    @Before
    public void before(){
        tank = new Tank("Bobby", 2000, 200, 2);
        cannon = new Cannon("Cannon", 2000, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Bobby", tank.getName());
    }

    @Test
    public void canShout(){
        assertEquals("Come and get me!", tank.shout("Come and get me!"));
    }

    @Test
    public void canAttack(){
        tank.attack(cannon);
        assertEquals(1800, cannon.getHealthValue());
    }

    @Test
    public void canMove(){
        assertEquals("I am moving at speed 2. A bit slow!", tank.move());
    }

}
