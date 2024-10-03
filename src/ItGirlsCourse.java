import itGirlsSchool.lesson7.ArrayListExample;
import itGirlsSchool.lesson7.BubbleSorting;
import itGirlsSchool.lesson7.HashMapExample;
import itGirlsSchool.lesson8.InsertionSort;
import itGirlsSchool.lesson8.MergeSort;
import itGirlsSchool.lesson8.QuickSort;
import itGirlsSchool.lesson7.StackExample;
import itGirlsSchool.lesson8.SelectionSort;
import itGirlsSchool.models.Admin;
import itGirlsSchool.models.User;

import java.util.Arrays;

public class ItGirlsCourse {

    public static void main(String[] args) {
        User zeroUser = new User("Vitold", "vitold@gmail.com", "649854");
        User secondUser = new User("Bonnie", "bonie@gmail.com", "967865");

        Admin admin = new Admin("Admin", "admin", "admin@admin.com");
        zeroUser.addFollower();
        zeroUser.addFollower();
        secondUser.addFollower();
        secondUser.addFollower();
        System.out.println(zeroUser);

        System.out.println("Admin " + admin.getUserName() + " has password " + admin.getPassword());

        admin.setNewPassword("admin1");
        System.out.println("Admin " + admin.getUserName() + "has password " + admin.getPassword());

        System.out.println(zeroUser.checkPassword("34234"));
        User.printCountOfFollowersForAllUsers();
        secondUser.logIn();
        secondUser.sendMessage("Привет!!!");
        secondUser.logOut();
        admin.logIn();
        admin.sendMessage("Тоже привет!!!!");
        admin.logOut();

    }

}