package ec.edu.espe.SlopeFormule.model;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class SlopeCalculator {

    public static float calculateSlope(float x1Axis, float x2Axis, float y1Axis, float y2Axis) {
        float y = y2Axis - y1Axis;
        float x = x2Axis - x1Axis;
        float slope = y / x;
        return slope;
    }
}

