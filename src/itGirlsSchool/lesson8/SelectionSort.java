package itGirlsSchool.lesson8;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;//0

            // Ищем минимальный элемент
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Меняем минимальный элемент с первым элементом
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        //1 6 4 8 7 10
        //1 4 6 8 7 10
    }

}