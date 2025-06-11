import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void mustSumNumbers() {
        Calculator calc = new Calculator();
        int sumResult = calc.sum(2, 3);
        System.out.println("Result of the sum: " + sumResult);
        Assertions.assertEquals(5, sumResult);
    }

    @Test
    public void mustSubtractNumbers() {
        Calculator calc = new Calculator();
        int subtractionResult = calc.subtract(2, 3);
        System.out.println("Result of the subtraction: " + subtractionResult);
        Assertions.assertEquals(-1, subtractionResult);

    }

    @Test
    public void mustMultiply() {
        Calculator calc = new Calculator();
        int multiplyResult = calc.multiply(2,3);
        System.out.println("Result of the subtraction: " + multiplyResult);
        Assertions.assertEquals(6,multiplyResult);
    }

    @Test
    public void mustDivide() {
        Calculator calc = new Calculator();
        double divideResult = calc.divide(2,4);
        System.out.println("Result of the division: " + divideResult);
        Assertions.assertEquals(0.5,divideResult);
    }

}
