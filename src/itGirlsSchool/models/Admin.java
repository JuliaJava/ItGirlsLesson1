package itGirlsSchool.models;

import itGirlsSchool.interfaces.AuthorizationInterface;

public class Admin extends SocialMediaUser implements AuthorizationInterface {

    public Admin(String name, String password, String email) {
        super(name, password, email);
    }

    @Override
    public void setNewPassword(String password) {
        System.out.println("Is new password correct - " + (password.length() >= 10));
        setPassword(password);
        System.out.println("Admin " + getUserName() + " set new password successfully");
    }

    @Override
    public String checkPassword(String password) {
        boolean isPasswordCorrect = getPassword().equals(password);
        return "Is password for admin correct - " + isPasswordCorrect;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Admin " + getUserName() + " sent message: " + message);
    }
}
