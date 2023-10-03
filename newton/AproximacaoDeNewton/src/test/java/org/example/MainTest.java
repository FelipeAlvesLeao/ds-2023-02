package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {
    @Test
    public void evaluatesExpression() {
        Main calculator = new Main();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }

}