import area.areaImpl.AreaImpl;
import area.Area;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/25.
 */
public class TestArea {
    private Area area;

    @Before
    public void setUp() throws Exception {
        area = new AreaImpl();
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(12f,area.area(2),0);
    }
}
