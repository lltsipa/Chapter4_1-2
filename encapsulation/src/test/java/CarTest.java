import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/25.
 */
public class CarTest {
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
        car.setCarType("Mercedes");
        car.setModel("G65");
        car.setYear(2015);
    }

    @Test
    public void testCarType() throws Exception {

        Assert.assertEquals("Mercedes",car.getCarType());

    }

    @Test
    public void testModel() throws Exception {

        Assert.assertEquals("G65",car.getModel());
    }

    @Test
    public void testYear() throws Exception {

        Assert.assertEquals(2015,car.getYear());
    }
}
