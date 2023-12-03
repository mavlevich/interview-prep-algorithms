//Given the coordinates of four points in 2D space p1, p2, p3 and p4, return true if the four points construct a square.
//The coordinate of a point pi is represented as [xi, yi]. The input is not given in any order.
//A valid square has four equal sides with positive length and four equal angles (90-degree angles).

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task7 {
    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] points = {p1, p2, p3, p4};
        double[] distances = new double[6];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                distances[k++] = calculateDistance(points[i], points[j]);
            }
        }
        Arrays.sort(distances);

        if (distances[0] == 0 ||
            distances[0] != distances[1] ||
            distances[0] == distances[4] ||
            distances[4] != distances[5]) {
            return false;
        }

        return distances[0] * 2 == distances[4];
    }

    public static double calculateDistance(int[] p1, int[] p2) {
        return  Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
}
