import calculator.Calculator;
import calculator.calculatorImpl.CalculatorImpl;
import calculator.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lodz on 2016/03/26.
 */
public class TestCalculator {
    private Calculator calculator;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calculator = (Calculator)ctx.getBean("cir");
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(11,calculator.add(8,3));

    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(7,calculator.subtract(10,3));
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(12,calculator.multiply(6,2));

    }
}
