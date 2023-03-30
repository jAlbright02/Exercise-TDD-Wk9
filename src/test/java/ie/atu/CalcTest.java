package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calculator myCalc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(30, myCalc.calcAdd(15, 15));

    }

    @Test
    public void testMultiply() {
        assertEquals(10, myCalc.calcMultiply(2, 5));

    }

    @Test
    public void testSubtract() {
        assertEquals(7, myCalc.calcSubtract(10, 3));

    }

    @Test
    public void testDivide() {
        assertEquals(3, myCalc.calcDivide(12, 4));

    }

}
