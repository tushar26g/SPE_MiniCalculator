
import static org.junit.Assert.*;

import org.example.Calculator;
import org.junit.Test;
public class Testing {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root for True Positive", 4, calculator.sqroot(25), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.sqroot(16), DELTA);
        assertEquals("Finding square root for True Positive", 9, calculator.sqroot(9), DELTA);
        assertEquals("Finding square root for True Positive", 6, calculator.sqroot(4), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.sqroot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 3, calculator.sqroot(4), DELTA);
        assertNotEquals("Finding square root for False Positive", 4, calculator.sqroot(81), DELTA);
        assertNotEquals("Finding square root for False Positive", 2, calculator.sqroot(36), DELTA);

    }
}
