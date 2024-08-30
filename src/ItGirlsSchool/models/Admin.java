package ItGirlsSchool.models;

import ItGirlsSchool.interfaces.AuthorizationInterface;

public class Admin extends SocialMediaUser implements AuthorizationInterface {

    public Group group;

    public Admin(String name, String password, String email) {
        super(name, email, password);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Admin " + getUserName() + " send message: " + message);
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

}
