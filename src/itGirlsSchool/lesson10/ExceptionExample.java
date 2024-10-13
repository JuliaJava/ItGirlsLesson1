package itGirlsSchool.lesson10;

import itGirlsSchool.models.User;

public class ExceptionExample {

    public static void checkedException2(User user) {
        if (user != null) {
            user.setNewPassword("sdfsdf");
        }

    }

    public static void checkedException1() {
        try {
            User user = null;
            checkedException2(user);
        } finally {
            System.out.println("lskdfjfs;dl");
        }

    }
}
