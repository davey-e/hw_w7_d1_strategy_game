import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiflemanTest {

    Rifleman rifleman;

    @Before
    public void before(){
        rifleman = new Rifleman("Jimmy", 500, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Jimmy", rifleman.getName());
    }
}
