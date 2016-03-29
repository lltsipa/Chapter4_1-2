import circle.Circle;
import circle.circleImpl.CircleImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/25.
 */
public class TestCircle
{
    Circle circle;

    @Before
    public void setUp() throws Exception {
        circle = new CircleImpl();
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(12,circle.area(2));
    }

    @Test
    public void testCircumfrence() throws Exception {
        Assert.assertEquals(6,circle.circumfrence(1));

    }
}
