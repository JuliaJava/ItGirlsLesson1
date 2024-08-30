package ItGirlsSchool.models;

import ItGirlsSchool.interfaces.AuthorizationInterface;

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
        return isPasswordCorrect;
    }

    @Override
    public void setNewPassword(String password) {
        setPassword(password);
        System.out.println("User " + getUserName() + " set new password successfully");
    }

    @Override
    public String checkPassword(String password) {
        return "Is password correct - " + isPasswordCorrect(password);
    }

    public static void setCountOfFollowerForAllUsers(int countOfFollowerForAllUsers) {
        User.countOfFollowerForAllUsers = countOfFollowerForAllUsers;
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
