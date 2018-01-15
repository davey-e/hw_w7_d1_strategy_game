import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MortarTest {

    Mortar mortar;

    @Before
    public void before(){
        mortar = new Mortar("Mortar", 500, 20);
    }

    @Test
    public void hasType(){
        assertEquals("Mortar", mortar.getType());
    }
}
