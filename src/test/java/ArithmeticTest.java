import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {
    Arithmetic arithmetic;

    @Before
    public void setUp() {
        arithmetic = new Arithmetic();
    }

    @Test
    public void add() {

        int actual = arithmetic.add(4,6);

        Assert.assertEquals(10,actual);
    }

    @Test
    public void subtract() {
        int actual = arithmetic.subtract(8,4);
        Assert.assertEquals(4,actual);
    }
}