package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.exceptions.DivisionByZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public double plus(double num1, double num2) {
        return num1 + num2;
    }
    @Override
    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 != 0){
            return num1 / num2;
        }
        else {
            throw new DivisionByZeroException("Деление на ноль.");
        }
    }


}
