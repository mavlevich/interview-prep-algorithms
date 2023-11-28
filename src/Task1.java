//  Find the second-smallest number in an array


import static java.lang.Math.min;
public class Task1 {
    public static int secondMinimumNumber(int[] array) {
        if (array.length < 2) {
            return -1;
        }
        int firstMinimumNumber = min(array[0], array[1]);
        int secondMinimumNumber = Math.max(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            if (array[i] < firstMinimumNumber) {
                secondMinimumNumber = firstMinimumNumber;
                firstMinimumNumber = array[i];
            }
            else if (array[i] < secondMinimumNumber) {
                secondMinimumNumber = array[i];
            }
        }
        return secondMinimumNumber;
    }
}
