import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiflemanTest {

    Rifleman rifleman;

    @Before
    public void before(){
        rifleman = new Rifleman("Johnny", 500, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Johnny", rifleman.getName());
    }

    @Test
    public void canShout(){
        assertEquals("Here's Johnny!", rifleman.shout("Here's Johnny!"));
    }
}
