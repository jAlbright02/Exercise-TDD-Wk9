package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calculator myCalc;

    @Test
    public void testAdd() {
        myCalc = new Calculator();

        assertEquals(30, myCalc.calcAdd(15, 15));

    }
}
