
package utils;

/**
 *
 * @author David Moran
 */

public class DivergenceSeries {
    public static String generateSeries(int n) {
        StringBuilder seriesBuilder = new StringBuilder();
        seriesBuilder.append("\nDivergence series:\n");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                seriesBuilder.append(" ").append(i);
            } else {
                seriesBuilder.append(" ").append(-i);
            }
        }

        return seriesBuilder.toString();
    }
}
