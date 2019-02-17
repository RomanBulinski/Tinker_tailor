import View.View;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTailor {

    @Test
    public void testPlayTailor(){
        Tailor tailor = new Tailor();
        View view = new View();
        String result = view.arrToString( tailor.playTailor(4,4) );
        assertEquals("0030",result );
    }

    @Test
    public void testPlayTailorSecondCheck(){
        Tailor tailor = new Tailor();
        View view = new View();
        String result = view.arrToString( tailor.playTailor(5,2) );
        assertEquals("00300",result );
    }


}
