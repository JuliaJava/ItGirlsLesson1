package itGirlsSchool.models;

import itGirlsSchool.interfaces.AuthorizationInterface;

public class Moderator extends SocialMediaUser implements AuthorizationInterface {

    public Group group;

    public Moderator(String moderatorName, String mail, String password) {
        super(moderatorName, password, mail);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Send message from moderator " + message);
    }

    @Override
    public void setNewPassword(String password) {
        if (password.length() != 0) {
            System.out.println("It's a good password. Password successfully change.");
            setPassword(password);
        } else {
            System.out.println("The password cann't be missing! Let's try again.");
        }
    }

    private boolean isPasswordCorrect(String password) {
        boolean isPasswordCorrect = getPassword().equals(password);
        String message = isPasswordCorrect ? "Password is correct" : "Password is not correct";
        System.out.println(message);
        return isPasswordCorrect;
    }

    @Override
    public String checkPassword(String password) {
        return "Is password correct - " + isPasswordCorrect(password);
    }

    private boolean сheckOfComment(String text) {
        if (text.contains("profanity"))
            return true;
        else
            return false;

    }


    private String invitation(String nameGroup, String userName) {
        String invit = "Welcome to the group " + nameGroup + ", " + userName;
        return invit;
    }

}
