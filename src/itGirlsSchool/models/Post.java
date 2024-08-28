package itGirlsSchool.models;

public class Post {
    public String content;
    public User author;
    public int likes;

    public Post(String content, User author) {
        this.content = content;
        this.author = author;
        this.likes = 0;  // Начальное количество лайков
    }

    public void addLike() {
        likes++;
    }

    public void displayPost() {
        System.out.println(author.getUserName() + " posted: " + content);
        System.out.println("Likes: " + likes);
    }
}
