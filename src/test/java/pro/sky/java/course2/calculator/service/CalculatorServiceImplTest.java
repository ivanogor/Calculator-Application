package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.exceptions.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorServiceImplTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @Test
    public void plusTestOne() {
        int num1 = 5;
        int num2 = 3;

        String expected = "5 + 3 = 8";
        String actual = calculatorService.plus(num1, num2);

        assertEquals(actual, expected);
    }

    @Test
    public void plusTestTwo() {
        int num1 = 2;
        int num2 = 0;

        String expected = "2 + 0 = 2";
        String actual = calculatorService.plus(num1, num2);

        assertEquals(actual, expected);
    }

    @Test
    public void minusTestOne() {
        int num1 = 5;
        int num2 = 3;

        String expected = "5 - 3 = 2";
        String actual = calculatorService.minus(num1, num2);

        assertEquals(actual, expected);
    }

    @Test
    public void minusTestTwo() {
        int num1 = 0;
        int num2 = 5;
        String expected = "0 - 5 = -5";
        String actual = calculatorService.minus(num1, num2);

        assertEquals(actual, expected);
    }

    @Test
    public void multiplyTestOne() {
        int num1 = 0;
        int num2 = 11;
        String expected = "0 * 11 = 0";
        String actual = calculatorService.multiply(num1, num2);

        assertEquals(actual, expected);
    }

    @Test
    public void multiplyTestTwo() {
        int num1 = 23;
        int num2 = 32;
        String expected = "23 * 32 = 736";
        String actual = calculatorService.multiply(num1, num2);

        assertEquals(actual, expected);
    }

    @Test
    public void divideTestOne() {
        double num1 = 33;
        double num2 = 11;
        String expected = "33.0 / 11.0 = 3.0";
        String actual = calculatorService.divide(num1, num2);

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
