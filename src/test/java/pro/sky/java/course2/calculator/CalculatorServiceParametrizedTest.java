package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.calculator.service.CalculatorServiceImpl;

import java.util.stream.Stream;

public class CalculatorServiceParametrizedTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForPlusTests() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(3, 4, 7),
                Arguments.of(5, 6, 11),
                Arguments.of(23, 77, 100)
        );
    }

    public static Stream<Arguments> provideParamsForMinusTests() {
        return Stream.of(
                Arguments.of(21, 3, 18),
                Arguments.of(6, 4, 2),
                Arguments.of(5, 6, -1),
                Arguments.of(23, 77, -54)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(21, 3, 63),
                Arguments.of(6, 4, 24),
                Arguments.of(5, -6, -30),
                Arguments.of(-10, -6, 60)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(21, 3, 7),
                Arguments.of(7, 2, 3.5),
                Arguments.of(5, 5, 1),
                Arguments.of(23, 10, 2.3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTests")
    public void parametrizedTestForPlus(double num1, double num2, double expected) {
        double actual = calculatorService.plus(num1, num2);
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void parametrizedTestForMinus(double num1, double num2, double expected) {
        double actual = calculatorService.minus(num1, num2);
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void parametrizedTestForMultiply(double num1, double num2, double expected) {
        double actual = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void parametrizedTestForDivide(double num1, double num2, double expected) {
        double actual = calculatorService.divide(num1, num2);
        Assertions.assertEquals(actual, expected);
    }
}
