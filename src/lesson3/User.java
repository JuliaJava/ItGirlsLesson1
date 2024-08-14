package lesson3;

public class User {
    public static int countOfFollowerForAllUsers;
    public String userName;
    public String mail;
    public int countOfFollowers;

    public User(String userName, String mail) {
        this.userName = userName;
        this.mail = mail;
    }

    public int addFollower() {
        countOfFollowerForAllUsers++;
        return ++countOfFollowers;
    }

    public void printDetails() {
        System.out.println("User full name: " + userName);
        System.out.println("Email: " + mail);
        System.out.println("Count of followers:" + countOfFollowers);
    }

    public static void printCountOfFollowersForAllUsers() {
        System.out.println("Common count of followers: " + countOfFollowerForAllUsers);
    }

}
