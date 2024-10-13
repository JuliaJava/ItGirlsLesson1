
import itGirlsSchool.lesson10.ExceptionExample;
import itGirlsSchool.models.Admin;
import itGirlsSchool.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ItGirlsCourse {

    public static void main(String[] args) throws Throwable {

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

        List<Integer> numbers = Arrays.asList(5, 89, 45, 22, 10, 2);
        List<Integer> numbersFiltered = numbers.stream().
                filter(numb -> numb % 2 == 0).
                map(numb -> numb * 2).
                toList();

        List<Integer> numbersSorted = numbers.stream().
                sorted(Comparator.reverseOrder()).
                toList();

        List<User> users = new ArrayList<>();
        users.add(zeroUser);
        users.add(secondUser);
        users.add(new User("Obi", "obi@gmail.com", "68496546+rfg"));
        users.add(new User("One", "one@gmail.com", "213"));
        users.add(new User("Kenobi", "kenobi@gmail.com", "654984asdasd1"));

        String vowels = "aeiou";
        vowels.contains("каждая буква в слове");

        List<User> usersWithO = users.stream().
                filter(user -> user.getUserName().startsWith("O")).
                toList();
        System.out.println(usersWithO);


        users.stream().
                filter(user -> user.getPassword().length() <= 6).
                forEach(user -> {
                    System.out.println(user.getPassword());
                    user.setNewPassword("DFSFEFXrfgsdz213");
                });


        ExceptionExample.checkedException1();

        User thirdUser = User.registerNewUser("Boris", "sldfj", "5364641efwfsdf");
        User fourUser = User.registerNewUser("Boris", "sldfj", "5364641efwfsdf");
        User fiveUser = User.registerNewUser("Boris1", "sldfj", "231");
    }


}
