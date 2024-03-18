package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;
import pro.sky.java.course2.calculator.service.CalculatorServiceImpl;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(name = "num1") double num1, @RequestParam(name = "num2") double num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(name = "num1") double num1, @RequestParam(name = "num2") double num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(name = "num1") double num1, @RequestParam(name = "num2") double num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(name = "num1") double num1, @RequestParam(name = "num2") double num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}
