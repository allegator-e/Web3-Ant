import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckAreaTest {
    private static double r;
    private static CheckArea checkArea;

    @Before
    public void init() {
        checkArea = new CheckArea();
    }

    static Stream<Arguments> radiusParam() {
        return Stream.of(
                arguments(1.0),
                arguments(1.5),
                arguments(2.0),
                arguments(2.5),
                arguments(3.0)
        );
    }

    //rectangle//
    @MethodSource("radiusParam")
    @ParameterizedTest
    public void rectangleBorderUpRightTrue(double r) {
        double  x  = 0;
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

}