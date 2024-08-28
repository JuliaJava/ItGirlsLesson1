import itGirlsSchool.models.Admin;
import itGirlsSchool.models.Comment;
import itGirlsSchool.models.Post;
import itGirlsSchool.models.User;

public class ItGirlsCourse {

    public static void main(String[] args) {
        User zeroUser = new User("Vitold", "vitold@gmail.com", "649854");
        User secondUser = new User("Bonie", "bonie@gmail.com", "967865");

        Admin admin = new Admin("Admin", "admin", "admin@admin.com");
        zeroUser.addFollower();
        zeroUser.addFollower();
        secondUser.addFollower();
        secondUser.addFollower();
        System.out.println(zeroUser.getMail());
        zeroUser.setUserName("sdfsdf");

        System.out.println(zeroUser.getUserName());
        System.out.println(zeroUser);
        secondUser.printDetails();


        Post post1 = new Post("Hello, world!", zeroUser);
        Comment comment1 = new Comment("Nice post!", secondUser);
        post1.addLike();
        post1.addLike();
        post1.displayPost();
        comment1.displayComment();

        System.out.println("Admin " + admin.getUserName() + "has password " + admin.getPassword());
        zeroUser.setNewPassword("1");
        zeroUser.printDetails();
        admin.setNewPassword("admin1");
        System.out.println(admin.checkPassword("admin1"));
        System.out.println(zeroUser.checkPassword("34234"));
        User.printCountOfFollowersForAllUsers();

        System.out.println();
        System.out.println();

        secondUser.sendMessage("Привет!!!");
        admin.sendMessage("Всех удалю!!!");

    }


}