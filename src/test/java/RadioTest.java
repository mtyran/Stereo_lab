import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio ;

    @Before
    public void before(){
        radio = new Radio("Bosch", "T1");
    }

    @Test
    public void canGetMake(){
        assertEquals("Bosch", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("T1", radio.getModel());
    }

    @Test
    public void canTune() {
        assertEquals("Radio1", radio.tune());
    }

    @Test
    public void canPlayRadio() {
        radio.play("Radio is playing.");
        assertEquals("Radio is playing.", radio.getActionTaken());
    }
}

