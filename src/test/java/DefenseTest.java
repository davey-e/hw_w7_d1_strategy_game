import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefenseTest {

    Defense defense;

    @Before
    public void before(){
        defense = new Defense("Cannon");
    }

    @Test
    public void hasType(){
        assertEquals("Cannon", defense.getType());
    }


}
