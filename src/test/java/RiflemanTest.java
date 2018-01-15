import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiflemanTest {

    Rifleman rifleman;
    Mortar mortar;

    @Before
    public void before(){
        rifleman = new Rifleman("Johnny", 500, 20, 4);
        mortar = new Mortar("Mortar", 500, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Johnny", rifleman.getName());
    }

    @Test
    public void canShout(){
        assertEquals("Here's Johnny!", rifleman.shout("Here's Johnny!"));
    }

    @Test
    public void canAttack(){
        rifleman.attack(mortar);
        assertEquals(480, mortar.getHealthValue());
    }

    @Test
    public void canMove(){
        assertEquals("I am moving at speed 4. Not bad!", rifleman.move());
    }
}
