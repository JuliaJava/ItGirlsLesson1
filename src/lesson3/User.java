package lesson3;

import lesson3.interfaces.AuthorizationInterface;

public class User implements AuthorizationInterface {
    public static int countOfFollowerForAllUsers;
    private String userName;
    private String password;
    private String mail;
    private int countOfFollowers;

    public User(String userName, String mail, String password) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
    }


    public int addFollower() {
        countOfFollowerForAllUsers++;
        return ++countOfFollowers;
    }

    public void printDetails() {
        System.out.println("User full name: " + userName);
        System.out.println("Email: " + mail);
        System.out.println("Count of followers:" + countOfFollowers);
        System.out.println("Password:" + password);
    }

    public static void printCountOfFollowersForAllUsers() {
        System.out.println("Common count of followers: " + countOfFollowerForAllUsers);
    }

    private boolean isPasswordCorrect(String password) {
        boolean isPasswordCorrect = this.password.equals(password);
        return isPasswordCorrect;
    }

    @Override
    public void setNewPassword(String password) {
        this.password = password;
        System.out.println("User " + this.userName + " set new password successfully");
    }

    @Override
    public String checkPassword(String password) {
        return "Is password correct - " + isPasswordCorrect(password);
    }

    public static void setCountOfFollowerForAllUsers(int countOfFollowerForAllUsers) {
        User.countOfFollowerForAllUsers = countOfFollowerForAllUsers;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCountOfFollowers(int countOfFollowers) {
        this.countOfFollowers = countOfFollowers;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", countOfFollowers=" + countOfFollowers +
                '}';
    }

    public static int getCountOfFollowerForAllUsers() {
        return countOfFollowerForAllUsers;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public int getCountOfFollowers() {
        return countOfFollowers;
    }
}
