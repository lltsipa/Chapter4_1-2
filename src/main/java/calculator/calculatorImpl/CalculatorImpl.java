package calculator.calculatorImpl;

import calculator.Calculator;

/**
 * Created by lodz on 2016/03/26.
 */
public class CalculatorImpl implements Calculator {
   // @Override
    public int add(int numOne, int numTwo) {
        return numOne+numTwo;
    }

   // @Override
    public int subtract(int numOne, int numTwo) {
        return numOne-numTwo;
    }

   // @Override
    public int multiply(int numOne, int numTwo) {
        return numOne*numTwo;
    }

  //  @Override
    public int area(int radius) {
        return (22/7)*(radius*radius);
    }
  //  @Override
    public int circumfrence(int radius) {
        return 2*(22/7)*radius;
    }
}
