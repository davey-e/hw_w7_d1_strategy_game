import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefenseTest {

    Defense defense;
    Tank tank;

    @Before
    public void before(){
        defense = new Cannon("Cannon", 1000, 50);
        tank = new Tank("Bobby", 2000, 200);
    }

    @Test
    public void hasType(){
        assertEquals("Cannon", defense.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(1000, defense.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(50, defense.getAttackValue());
    }

    @Test
    public void canSetHealthValue(){
        defense.setHealthValue(2000);
        assertEquals(2000, defense.getHealthValue());
    }

    @Test
    public void canAttack(){
        defense.attack(tank);
        assertEquals(1950, tank.getHealthValue());
    }

}
