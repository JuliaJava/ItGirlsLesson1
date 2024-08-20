import lesson3.User;

public class ItGirlsCourse {
    public static void main(String[] args) {
        User zeroUser = new User("Vitold", "vitold@gmail.com");
        User secondUser = new User("Bonie", "bonie@gmail.com");
        User thirdUser = new User("Uniq", "uniq@gmail.com");

        zeroUser.addFollower();
        zeroUser.addFollower();
        secondUser.addFollower();

        zeroUser.printDetails();
        secondUser.printDetails();

        User.printCountOfFollowersForAllUsers();
        //написать классы Post и Comment, добавить в них свойства(переменные) и методы (на ваше усмотрение, не забываем про static)
        // в методе main() вызвать методы и поработать с переменными объектов и классов
    }
}