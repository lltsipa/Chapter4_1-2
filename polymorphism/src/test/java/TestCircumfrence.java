import circumfrence.Circumfrence;
import circumfrence.circumfrenceImpl.CircumfrenceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/25.
 */
public class TestCircumfrence {
    private Circumfrence circumfrence;

    @Before
    public void setUp() throws Exception {
        circumfrence = new CircumfrenceImpl();
    }

    @Test
    public void testCircumfrence() throws Exception {
        Assert.assertEquals(12,circumfrence.circumfrence(2));
    }
}
