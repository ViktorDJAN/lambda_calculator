package app;

import calculator.Calculator;
import view.View;

public class App {
    public static void runCalculator() {
        View view = new View();
        view.greeting();
        Calculator calculator = new Calculator(view.enteringExpression());
        view.printResult(calculator.compute());
}
}
