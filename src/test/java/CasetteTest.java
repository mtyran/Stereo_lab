import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasetteTest {

    Casette casette;

    @Before
    public void before(){
        casette = new Casette("Sony", "X5", 2);
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", casette.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("X5", casette.getModel());
    }

    @Test
    public void canGetNumTapes() {
        assertEquals(2, casette.getNumTapes());
    }

    @Test
    public void canPlayCasette() {
        casette.play("Casette is playing.");
        assertEquals("Casette is playing.", casette.getActionTaken());
    }
}
