package itGirlsSchool.lesson8;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i]; //array[5] //1
            int lastSortedIndex = i - 1; //4

            //Будем двигаться по массиву слева направо, начиная с элемента, который стоит прямо перед key,
            // и будем проверять, не нужно ли его сдвинуть вправо.
            while (lastSortedIndex >= 0 && array[lastSortedIndex] > key) {
                //если элемент в lastSortedIndex больше, чем наше ключевое значение,
                //значит двигаем его вправо
                array[lastSortedIndex + 1] = array[lastSortedIndex]; //array[1] = array[0] = 4
                //после этого сдвигаем lastSortedIndex влево, чтобы убедиться, что
                //предыдущие элементы тоже не больше ключевого значения
                lastSortedIndex--;
            }
            //4 6 10 8 7 1
            //4 6 8 10 7 1
            //4 6 8 7 10 1
            //4 6 7 8 10 1
            //1 4 6 7 8 10
            //находим правильное место для вставки ключевого значения
            array[lastSortedIndex + 1] = key;
        }
    }

}
