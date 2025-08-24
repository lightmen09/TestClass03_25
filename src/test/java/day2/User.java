package day2;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;

    }
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("Mikhail1", "password1");
        users[1] = new User("Mikhail2", "password2");
        users[2] = new User("Mikhail3", "password3");
        users[3] = new User("Mikhail4", "password4");
        users[4] = new User("Mikhail5", "password5");
        for (User user : users) {
            System.out.println("Login " + user.login + "Password " +user.password );
        }
    }
}
