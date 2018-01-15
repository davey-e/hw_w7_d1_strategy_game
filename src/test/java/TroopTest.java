import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TroopTest {

    Troop troop;
    Cannon cannon;

    @Before
    public void before(){
        troop = new Tank("Bobby", 1000, 50);
        cannon = new Cannon("Cannon", 2000, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Bobby", troop.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(1000, troop.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(50, troop.getAttackValue());
    }

    @Test
    public void canSetHealthValue(){
        troop.setHealthValue(2000);
        assertEquals(2000, troop.getHealthValue());
    }

    @Test
    public void canAttack(){
        troop.attack(cannon);
        assertEquals(1950, cannon.getHealthValue());
    }

}
