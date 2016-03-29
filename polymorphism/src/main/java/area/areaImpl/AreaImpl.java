package area.areaImpl;

import area.Area;

/**
 * Created by lodz on 2016/03/25.
 */
public class AreaImpl implements Area {
    public int area(int radius) {
        return (22/7)*(radius*radius);
    }
}
