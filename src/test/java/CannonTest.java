import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CannonTest {

    Cannon cannon;

    @Before
    public void before(){
        cannon = new Cannon("Cannon", 1000, 50);
    }

    @Test
    public void hasType(){
        assertEquals("Cannon", cannon.getType());
    }
}
