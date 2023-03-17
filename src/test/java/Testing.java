
import static org.junit.Assert.*;

import org.example.Calculator;
import org.junit.Test;
public class Testing {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 720, calculator.fact(6), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.fact(1), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.fact(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.fact(4), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.fact(0), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 113, calculator.fact(5), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 10, calculator.fact(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 42, calculator.fact(4), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 9, calculator.fact(2), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 0, calculator.fact(0), DELTA);
    }
    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root for True Positive", 5, calculator.sqroot(25), DELTA);
        assertEquals("Finding square root for True Positive", 4, calculator.sqroot(16), DELTA);
        assertEquals("Finding square root for True Positive", 3, calculator.sqroot(9), DELTA);
        assertEquals("Finding square root for True Positive", 2, calculator.sqroot(4), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.sqroot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 3, calculator.sqroot(4), DELTA);
        assertNotEquals("Finding square root for False Positive", 4, calculator.sqroot(81), DELTA);
        assertNotEquals("Finding square root for False Positive", 2, calculator.sqroot(36), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, calculator.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, calculator.power(4, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(2, 3), DELTA);
    }
}
