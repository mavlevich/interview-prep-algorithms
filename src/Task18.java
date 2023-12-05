//Given an integer numRows, return the first numRows of Pascal's triangle.
//
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
//Example 1:
//
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//Example 2:
//
//Input: numRows = 1
//Output: [[1]]
//
// Leetcode, level: EASY
// https://leetcode.com/problems/pascals-triangle/description/

import java.util.List;
import java.util.ArrayList;

public class Task18 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        triangle.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}
