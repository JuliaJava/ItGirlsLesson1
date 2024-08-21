package lesson3;

public class Comment {

    public String text;
    public User author;

    public Comment(String text, User author) {
        this.text = text;
        this.author = author;
    }

    public void displayComment() {
        System.out.println(author.getUserName() + " commented: " + text);
    }

}
