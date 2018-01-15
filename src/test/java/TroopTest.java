import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TroopTest {

    Troop troop;

    @Before
    public void before(){
        troop = new Troop("Bobby", 1000);
    }

    @Test
    public void hasName(){
        assertEquals("Bobby", troop.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(1000, troop.getHealthValue());
    }

}
