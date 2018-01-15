import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TroopTest {

    Troop troop;

    @Before
    public void before(){
        troop = new Troop("Bobby");
    }

    @Test
    public void hasName(){
        assertEquals("Bobby", troop.getName());
    }

}
