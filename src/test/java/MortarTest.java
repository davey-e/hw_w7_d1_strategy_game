import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MortarTest {

    Mortar mortar;
    Rifleman rifleman;

    @Before
    public void before(){
        mortar = new Mortar("Mortar", 500, 20);
        rifleman = new Rifleman("Johnny", 500, 20, 4);
    }

    @Test
    public void hasType(){
        assertEquals("Mortar", mortar.getType());
    }

    @Test
    public void canAttack(){
        mortar.attack(rifleman);
        assertEquals(480, rifleman.getHealthValue());
    }
}
