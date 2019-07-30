import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDTest {

    CD cd ;

    @Before
    public void before(){
        cd = new CD("Panasonic", "Y3", 5);
    }

    @Test
    public void canGetMake(){
        assertEquals("Panasonic", cd.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Y3", cd.getModel());
    }

    @Test
    public void canGetNumTapes() {
        assertEquals(5, cd.getNumDiscs());
    }

    @Test
    public void canPlayCD() {
        cd.play("CD is playing.");
        assertEquals("CD is playing.", cd.getActionTaken());
    }
}
