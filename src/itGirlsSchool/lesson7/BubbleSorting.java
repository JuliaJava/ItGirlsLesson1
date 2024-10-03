package itGirlsSchool.lesson7;

import java.util.Arrays;

public class BubbleSorting {

    public static boolean bubbleSort() {
        int[] bubbleArray = {5,4,3,2,1};
        int[] orderedArray = {1,2,3,4,5};
        //0 1 2 3 4
        //5 4 3 2 1
        //4 3 2 1 5    0  1
        //3 2 1 4 5    1  2
        //2 1 3 4 5    2  3
        //1 2 3 4 5    3  4
        //1 2 3 4 5    4  5

        int tempVar;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < bubbleArray.length - 1; j++) {
                if (bubbleArray[j] > bubbleArray[j + 1]) {
                    tempVar = bubbleArray[j + 1];
                    bubbleArray[j + 1] = bubbleArray[j];
                    bubbleArray[j] = tempVar;
                    System.out.println(Arrays.toString(bubbleArray));
                }
            }
        }
        System.out.println(Arrays.toString(bubbleArray));
        boolean isArrayOrdered = Arrays.equals(bubbleArray, orderedArray);

        return isArrayOrdered;
    }
}
