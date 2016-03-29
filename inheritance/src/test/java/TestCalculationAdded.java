import calculation.Calculation;
import calculation.calculationImpl.CalculationImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/25.
 */
public class TestCalculationAdded
{
    private Calculation calculation;
    //private Calculation calculationAdded;

    @Before
    public void setUp() throws Exception {
      //  calculationAdded = new CalculationAdded();
        calculation = new CalculationImpl();
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(10, calculation.add(8,2));
    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(6, calculation.subtract(8,2));
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(16, calculation.multiply(8,2));

    }
}
