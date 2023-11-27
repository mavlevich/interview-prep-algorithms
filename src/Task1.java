public class Task1 {
    // Метод для слияния двух отсортированных массивов
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int m = array1.length;
        int n = array2.length;

        // Создаем новый массив для объединения
        int[] mergedArray = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Слияние массивов
        while (i < m && j < n) {
            if (array1[i] <= array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }

        // Добавление оставшихся элементов из array1 (если есть)
        while (i < m) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        // Добавление оставшихся элементов из array2 (если есть)
        while (j < n) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
