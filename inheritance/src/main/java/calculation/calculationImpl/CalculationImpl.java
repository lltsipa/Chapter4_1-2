package calculation.calculationImpl;

import calculation.Calculation;

/**
 * Created by lodz on 2016/03/26.
 */
public class CalculationImpl implements Calculation{
    public int add(int numOne, int numTwo) {
        return numOne+numTwo;
    }

    public int subtract(int numOne, int numTwo) {
        return numOne-numTwo;
    }

    public int multiply(int numOne, int numTwo) {
        return numOne*numTwo;
    }
}
