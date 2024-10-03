package itGirlsSchool.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListExample {

    public static void arrayExample() {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("asdfsaf");
        stringArrayList.add("wertfrf");
        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(1,23,3));
        System.out.println(intArrayList);
    }

}
