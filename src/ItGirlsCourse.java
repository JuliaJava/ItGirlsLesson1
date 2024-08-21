import lesson3.Admin;
import lesson3.Comment;
import lesson3.Post;
import lesson3.User;

public class ItGirlsCourse {

    public static void main(String[] args) {
        User zeroUser = new User("Vitold", "vitold@gmail.com", "649854");
        User secondUser = new User("Bonie", "bonie@gmail.com", "967865");

        Admin admin = new Admin("Admin", "admin");
        zeroUser.addFollower();
        zeroUser.addFollower();
        secondUser.addFollower();

        zeroUser.getMail();
        zeroUser.setUserName("kljdf");

        System.out.println(zeroUser.getUserName());
        System.out.println(zeroUser);
        secondUser.printDetails();


        Post post1 = new Post("Hello, world!", zeroUser);
        Comment comment1 = new Comment("Nice post!", secondUser);
        post1.addLike();
        post1.addLike();
        post1.displayPost();
        comment1.displayComment();

        System.out.println("Admin " + admin.name + "has password " + admin.password);
        zeroUser.setNewPassword("1");
        zeroUser.printDetails();
        admin.setNewPassword("admin1");
        System.out.println("Admin " + admin.name + "has password " + admin.password);
        System.out.println(admin.checkPassword("admin1"));
        System.out.println(zeroUser.checkPassword("34234"));
        User.printCountOfFollowersForAllUsers();


    }


}