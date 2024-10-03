package itGirlsSchool.lesson8;

public class MergeSort {

    private static int sortingDepth = 1;

    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            System.out.println("Глубина сортировки: " + sortingDepth + ". Обрабатываем массив с " + start + " элемента до " + end);
            sortingDepth++;
            int mid = (start + end) / 2; //0+5 =2
            //сначала сортируем левую часть
            //опять рекурсия
            mergeSort(array, start, mid); //0 2
            //потом сортируем правую часть
            mergeSort(array, mid + 1, end);
            //сливаем отсортированные массивы в один
            merge(array, start, mid, end);
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {
        //вычисляем длину левого массива
        System.out.println("mid: "+ mid + ", start= " + start + ", end =" + end);
        int lengthLeftArray = mid - start + 1; //0-0 +1
        System.out.println(lengthLeftArray);
        //вычисляем длину правого массива
        int lengthRightArray = end - mid; //1-0
        System.out.println(lengthRightArray);

        //создаем временные массивы
        int[] leftArray = new int[lengthLeftArray];
        int[] rightArray = new int[lengthRightArray];

        // Копируем в них данные
        System.arraycopy(array, start, leftArray, 0, lengthLeftArray);
        System.arraycopy(array, mid + 1, rightArray, 0, lengthRightArray);

        // Индексы для временных массивов
        //Они будут использоваться для отслеживания текущей позиции в левом и правом подмассивах
        int leftIndex = 0;
        int rightIndex = 0;

        //Этот индекс отслеживает текущую позицию в исходном массиве (array), куда мы будем сливать элементы из двух
        //подмассивов (левого и правого). Мы начинаем с позиции start (начала диапазона, который нужно сортировать)
        int mainArrayIndex = start;

        //Этот цикл продолжается до тех пор, пока у нас есть элементы в обоих подмассивах (leftArray и rightArray).
        //Как только один из массивов будет исчерпан, цикл завершится
        while (leftIndex < lengthLeftArray && rightIndex < lengthRightArray) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                //копируем текущий элемент из левого подмассива в исходный массив
                array[mainArrayIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                //копируем элемент из правого подмассива в исходный массив
                array[mainArrayIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            //не забываем прибавить индекс у главного массива, чтобы не перезаписать элемент
            mainArrayIndex++;
        }

        // Копируем оставшиеся элементы
        //Цикл продолжается до тех пор, пока в ЛЕВОМ подмассиве есть неиспользованные элементы
        while (leftIndex < lengthLeftArray) {
            array[mainArrayIndex] = leftArray[leftIndex];
            leftIndex++;
            mainArrayIndex++;
        }

        //А этот цикл продолжается до тех пор, пока в ПРАВОМ подмассиве есть неиспользованные элементы
        while (rightIndex < lengthRightArray) {
            array[mainArrayIndex] = rightArray[rightIndex];
            rightIndex++;
            mainArrayIndex++;
        }
        sortingDepth--;
    }

}
