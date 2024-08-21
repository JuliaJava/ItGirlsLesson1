import lesson3.Comment;
import lesson3.Post;
import lesson3.User;

public class ItGirlsCourse {

    public static void main(String[] args) {
        User zeroUser = new User("Vitold", "vitold@gmail.com");
        User secondUser = new User("Bonie", "bonie@gmail.com");

        zeroUser.addFollower();
        zeroUser.addFollower();
        secondUser.addFollower();

        zeroUser.printDetails();
        secondUser.printDetails();

        Post post1 = new Post("Hello, world!", zeroUser);
        Comment comment1 = new Comment("Nice post!", secondUser);
        post1.addLike();
        post1.addLike();
        post1.displayPost();
        comment1.displayComment();

        User.printCountOfFollowersForAllUsers();

    }


}