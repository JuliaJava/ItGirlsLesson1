package itGirlsSchool.models;

public class Bloger extends SocialMediaUser {

    private Group group;

    public Bloger(String userName, String password, String mail) {
        super(userName, password, mail);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Influencer " + getUserName() + " sent message: " + message);
    }
}
