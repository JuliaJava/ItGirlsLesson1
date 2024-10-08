package itGirlsSchool.models;

public abstract class SocialMediaUser {

    private String userName;
    private String password;
    private String email;

    public SocialMediaUser(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public abstract void sendMessage(String message);

    public void logIn() {
        System.out.println("User " + userName + " log in");
    }

    public void logOut() {
        System.out.println("User " + userName + " log out");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
