package itGirlsSchool.lesson8;

import java.util.Arrays;

public class QuickSort {

    private static int sortingDepth = 1;

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            //делим массив на две части. Слева - все элементы меньше, чем опорный элемент, справа - элементы больше
            System.out.println("Глубина сортировки: " + sortingDepth + ". Обрабатываем массив с " + start + " элемента до " + end);
            int pivotIndex = partition(array, start, end); //0
            // Сортируем сначала левую часть
            //Тут получается рекурсия - то есть вызов метода из самого себя и закончится это только тогда, когда
            //start и end сравнятся, то есть в массиве нечего уже будет сортировать
            sortingDepth++;
            quickSort(array, start, pivotIndex - 1);
            // Потом сортируем правую часть
            quickSort(array, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        /*выбираем ключевой (опорный) элемент, как правило это последний или первый элемент массива,
        но можно в принципе взять любой*/
        int keyElement = array[end]; //4
        //вводим временную переменную, для того, чтобы отслеживать куда нужно переместить элемент
        int keyIndex = start - 1; //0

        //перебираем все элементы, и если найдем элемент меньше, чем наш ключевой, то передвигаем его в левую часть
        for (int j = start; j < end; j++) { //j=1
            System.out.println("j = " + j + ", keyElement = " + keyElement + ", array[j] = " + array[j] + ", keyIndex = " + keyIndex);
            if (array[j] < keyElement) { // 6<4
                keyIndex++;//2
                int temp = array[keyIndex]; //6
                array[keyIndex] = array[j]; //6
                array[j] = temp; //6
            }
        }

        //чтобы не перезаписать элемент увеличим индекс
        keyIndex++;
        //в конце надо поставить наш опорный элемент на место - между левой и правой частями
        int temp = array[keyIndex]; //6
        array[keyIndex] = keyElement; //4
        array[end] = temp; // =6
        //1 4 6 7 8 10
        System.out.println(Arrays.toString(array));
        //и возвращаем новый индекс нашего ключевого элемента, чтобы потом знать, как поделить массив
        return keyIndex;
    }

}
