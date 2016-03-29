package circle.circleImpl;

import area.Area;
import area.areaImpl.AreaImpl;
import circle.Circle;
import circumfrence.Circumfrence;
import circumfrence.circumfrenceImpl.CircumfrenceImpl;

/**
 * Created by lodz on 2016/03/25.
 */
public class CircleImpl implements Circle,Area,Circumfrence{
    private Area area = new AreaImpl();
    private Circumfrence circumfrence = new CircumfrenceImpl();

    public int area(int radius) {
        return area.area(radius);
    }

    public int circumfrence(int radius) {
        return circumfrence.circumfrence(radius);
    }
}
