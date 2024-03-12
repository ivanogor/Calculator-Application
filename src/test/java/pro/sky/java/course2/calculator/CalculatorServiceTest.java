package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.exceptions.DivisionByZeroException;
import pro.sky.java.course2.calculator.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorServiceTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @Test
    public void plusTestOne() {
        double num1 = 5;
        double num2 = 3;

        double actual = calculatorService.plus(num1, num2);
        double expected = 8;

        assertEquals(actual, expected);
    }

    @Test
    public void plusTestTwo() {
        double num1 = 2;
        double num2 = 0;

        double actual = calculatorService.plus(num1, num2);
        double expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    public void minusTestOne() {
        int num1 = 5;
        int num2 = 3;

        double actual = calculatorService.minus(num1, num2);
        double expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    public void minusTestTwo() {
        double num1 = 0;
        double num2 = 5;

        double actual = calculatorService.minus(num1, num2);
        double expected = -5;

        assertEquals(actual, expected);
    }

    @Test
    public void multiplyTestOne() {
        int num1 = 0;
        int num2 = 11;

        double actual = calculatorService.multiply(num1, num2);
        double expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void multiplyTestTwo() {
        int num1 = 23;
        int num2 = 32;

        double actual = calculatorService.multiply(num1, num2);
        double expected = 736;

        assertEquals(actual, expected);
    }

    @Test
    public void divideTestOne() {
        double num1 = 33;
        double num2 = 11;

        double expected = 3;
        double actual = calculatorService.divide(num1, num2);

        assertEquals(actual, expected);
    }

    @Test
    public void divideTestTwo() {
        double num1 = 2;
        double num2 = 0;

        try {
            calculatorService.divide(num1, num2);
            fail("Деление на ноль.");
        }
        catch (DivisionByZeroException e) {

        }
    }
}
