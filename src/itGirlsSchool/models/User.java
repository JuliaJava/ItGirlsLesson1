package itGirlsSchool.models;

import itGirlsSchool.interfaces.AuthorizationInterface;

public class User extends SocialMediaUser implements AuthorizationInterface {

    public Group group;
    public static int countOfFollowerForAllUsers;
    private int countOfFollowers;

    public User(String userName, String mail, String password) {
        super(userName, password, mail);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Send message " + message);
    }


    public int addFollower() {
        countOfFollowerForAllUsers++;
        return ++countOfFollowers;
    }

    public static void printCountOfFollowersForAllUsers() {
        System.out.println("Common count of followers: " + countOfFollowerForAllUsers);
    }

    private boolean isPasswordCorrect(String password) {
        boolean isPasswordCorrect = getPassword().equals(password);
        String message = isPasswordCorrect ? "Password is correct" : "Password is not correct";
        System.out.println(message);
        return isPasswordCorrect;
    }

    @Override
    public void setNewPassword(String password) {
        if (password.length() >= 10 && password.length() < 20) {
            System.out.println("It is a perfect choice " + getUserName() + "! Password successfully change");
            setPassword(password);
        } else {
            System.out.println("It's too short password, let's try again!");
        }
    }

    @Override
    public String checkPassword(String password) {
        return "Is password correct - " + isPasswordCorrect(password);
    }

    public void setCountOfFollowers(int countOfFollowers) {
        this.countOfFollowers = countOfFollowers;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + getUserName() + '\'' +
                ", mail='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", countOfFollowers=" + countOfFollowers +
                '}';
    }

    public static int getCountOfFollowerForAllUsers() {
        return countOfFollowerForAllUsers;
    }

    public int getCountOfFollowers() {
        return countOfFollowers;
    }
}
