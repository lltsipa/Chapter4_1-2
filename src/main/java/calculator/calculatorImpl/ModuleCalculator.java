package calculator.calculatorImpl;

import calculation.Calculation;
import calculation.calculationImpl.CalculationImpl;
import calculator.Calculator;
import circle.Circle;
import circle.circleImpl.CircleImpl;

/**
 * Created by lodz on 2016/03/26.
 */
public class ModuleCalculator implements Calculator {

    private Calculation calculator = new CalculationImpl();
    private Circle circle = new CircleImpl();

    public int add(int numOne, int numTwo) {

        return calculator.add(numOne,numOne);
    }

    public int subtract(int numOne, int numTwo) {

        return calculator.subtract(numOne,numTwo);
    }

    public int multiply(int numOne, int numTwo) {

        return calculator.multiply(numOne,numTwo);
    }

    public int area(int radius) {
        return circle.area(radius);
    }

    public int circumfrence(int radius) {

        return circle.circumfrence(radius);
    }

}
