package lesson3;

import lesson3.interfaces.AuthorizationInterface;

public class Admin implements AuthorizationInterface {

    public String name;
    public String password;

    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public void setNewPassword(String password) {
        System.out.println("Is new password correct - " + (password.length() >= 10));
        this.password = password;
        System.out.println("Admin " + this.name + " set new password successfully");
    }

    @Override
    public String checkPassword(String password) {
        boolean isPasswordCorrect = this.password.equals(password);
        return "Is password for admin correct - " + isPasswordCorrect;
    }

}
