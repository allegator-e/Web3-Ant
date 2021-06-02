import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckAreaTest {
    private static double r = 1.0;
    private static CheckArea checkArea;

    @Before
    public void init() {
        checkArea = new CheckArea();
    }

    //rectangle//
    @Test
    public void rectangleBorderUpRightTrue() {
        double  x  = 0;
        r = 1.0;
        double y = r;
        assertTrue(checkArea.getHit(x, y, r));
    }

    @Test
    public void rectangleBorderUpRightFalse() {
        double x = 1;
        r = 1.0;
        double y = r;
        assertFalse(checkArea.getHit(x, y, r));
    }

    @Test
    public void rectangleBorderUpLeftTrue() {
        double x = -r/2;
        r = 1.0;
        double y = r;
        assertTrue(checkArea.getHit(x, y, r));
    }

    @Test
    public void rectangleBorderUpLeftFalse() {
        double x = 1;
        r = 1.0;
        double y = r;
        assertFalse(checkArea.getHit(x, y, r));
    }

    @Test
    public void rectangleBorderDownLeftTrue() {
        double x = -r/2;
        r = 1.0;
        double y = 0;
        assertTrue(checkArea.getHit(x, y, r));
    }
    @Test
    public void rectangleBorderDownLeftFalse() {
        double x = 1;
        r = 1.0;
        double y = r;
        assertFalse(checkArea.getHit(x, y, r));
    }

    @Test
    public void rectangleBorderDownRightTrue() {
        double x = r;
        r = 1.0;
        double y = 0;
        assertTrue(checkArea.getHit(x, y, r));
    }
    @Test
    public void rectangleBorderDownRightFalse() {
        double x = 1;
        r = 1.0;
        double y = r;
        assertFalse(checkArea.getHit(x, y, r));
    }

    //triangle//

    @Test
    public void triangleBorderDownLeftTrue() {
        double x = 0;
        r = 1.0;
        double y = 0;
        assertTrue(checkArea.getHit(x, y, r));
    }
    @Test
    public void triangleBorderDownLeftFalse() {
        double x = 1;
        r = 1.0;
        double y = r;
        assertFalse(checkArea.getHit(x, y, r));
    }

    @Test
    public void triangleBorderDownRightTrue() {
        double x = r;
        r = 1.0;
        double y = 0;
        assertTrue(checkArea.getHit(x, y, r));
    }
    @Test
    public void triangleBorderDownRightFalse() {
        double x = 1;
        r = 1.0;
        double y = r;
        assertFalse(checkArea.getHit(x, y, r));
    }

    @Test
    public void triangleBorderUpTrue() {
        double x = 0;
        r = 1.0;
        double y = r;
        assertTrue(checkArea.getHit(x, y, r));
    }
    @Test
    public void triangleBorderUpFalse() {
        double x = 1;
        r = 1.0;
        double y = r;
        assertFalse(checkArea.getHit(x, y, r));
    }

    //circle//

    @Test
    public void circleBorderDownTrue() {
        double x = 0;
        r = 1.0;
        double y = -r / 2;
        assertTrue(checkArea.getHit(x, y, r));
    }

    @Test
    public void circleBorderDownFalse() {
        double x = 0;
        r = 1.0;
        double y = -r / 2 - 0.000001;
        assertFalse(checkArea.getHit(x, y, r));
    }

    @Test
    public void circleBorderUpLeftTrue() {
        double x = 0;
        r = 1.0;
        double y = -r / 2;
        assertTrue(checkArea.getHit(x, y, r));
    }
    @Test
    public void circleBorderUpLeftFalse() {
        double x = 0 - 0.000001;
        r = 1.0;
        double y = 0 - 0.000001;
        assertFalse(checkArea.getHit(x, y, r));
    }

    @Test
    public void circleBorderUpRightTrue() {
        double x = 0;
        r = 1.0;
        double y = -r / 2;
        assertTrue(checkArea.getHit(x, y, r));
    }

    @Test
    public void circleBorderUpRightFalse() {
        double x = r/2 + 0.00001;
        r = 1.0;
        double y = 0 - 0.00001;
        assertFalse(checkArea.getHit(x, y, r));
    }

    //доп тесты

    @Test
    public void circleMediumTrue() {
        double x = r * 0.25;
        r = 1.0;
        double y = -r * 0.25;
        assertTrue(checkArea.getHit(x, y, r));
    }

    @Test
    public void circleMediumFalse() {
        double x = r / 2 ;
        r = 1.0;
        double y = -r / 2;
        assertFalse(checkArea.getHit(x, y, r));
    }

    @Test
    public void noNameSpaceFalse () {
        double x = -r * 0.25 ;
        r = 1.0;
        double y = -r * 0.25;
        assertFalse(checkArea.getHit(x, y, r));
    }

    @Test
    public void triangleMediumTrue() {
        double x = r * 0.25;
        r = 1.0;
        double y = r * 0.25;
        assertTrue(checkArea.getHit(x, y, r));
    }

    @Test
    public void triangleMediumFalse() {
        double x = r / 2;
        r = 1.0;
        double y = r / 2;
        assertFalse(checkArea.getHit(x, y, r));
    }

    @Test
    public void rectangleMediumTrue() {
        double x = -r / 2;
        r = 1.0;
        double y = r / 2;
        assertTrue(checkArea.getHit(x, y, r));
    }

    @Test
    public void rectangleMediumFalse() {
        double x = -r * 0.75 ;
        r = 1.0;
        double y = r * 0.75;
        assertFalse(checkArea.getHit(x, y, r));
    }






}