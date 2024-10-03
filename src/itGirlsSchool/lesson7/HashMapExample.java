package itGirlsSchool.lesson7;

import itGirlsSchool.models.User;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void hashExample() {
        HashMap<Integer, User> hashMapExample = new HashMap<>();
        hashMapExample.put(1, new User("Oleg", "dlfjsd", "qwew"));
        hashMapExample.put(2, new User("Oleg1", "dlfjsd", "qwew"));
        hashMapExample.put(3, new User("Oleg2", "dlfjsd", "qwew"));

        hashMapExample.remove(1);
        for(Map.Entry<Integer, User> user: hashMapExample.entrySet()) {
            System.out.println(user.getValue());
        }
    }
}
