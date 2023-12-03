//Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane,
//return the maximum number of points that lie on the same straight line.
//        Input: points = [[1,1],[2,2],[3,3]]
//        Output: 3
//
//        Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
//        Output: 4


import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static int maxPoints(int[][] points) {
        if (points.length <= 1) {
            return points.length;
        }

        int maxPoints = 1;

        for (int i = 0; i < points.length - 1; i++) {
            Map<Double, Integer> slopeCount = new HashMap<>();
            int duplicate = 0;
            int localMax = 1;

            for (int j = i + 1; j < points.length; j++) {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];

                if (x1 == x2 && y1 == y2) {
                    duplicate++;
                }
                else {
                    double slope = (x1 == x2) ? Double.POSITIVE_INFINITY : (double) (y2 - y1) / (x2 - x1);
                    slopeCount.put(slope, slopeCount.getOrDefault(slope, 1) + 1);
                    localMax = Math.max(localMax, slopeCount.get(slope));
                }
            }
            maxPoints = Math.max(maxPoints, localMax + duplicate);
        }
        return -1;
    }
}
