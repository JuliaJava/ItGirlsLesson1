import itGirlsSchool.models.Admin;
import itGirlsSchool.models.Comment;
import itGirlsSchool.models.Post;
import itGirlsSchool.models.User;

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

        Post post1 = new Post("Hello, world!", zeroUser);
        Comment comment1 = new Comment("Nice post!", secondUser);
        post1.addLike();
        post1.publishPost();
        post1.addLike();
        post1.deletePost();
        comment1.displayComment();

        for (int i = 0; i < 5; i++) {
            post1.addLike();
        }

        zeroUser.setNewPassword("2df000000000");

        System.out.println(admin.checkPassword("admin1"));

    }

}