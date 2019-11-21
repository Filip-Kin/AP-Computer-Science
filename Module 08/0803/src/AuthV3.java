/**
 * Author: Filip Kin
 * Version: 2019-11-20
 * Description: Creates a user object to log people in
 */

public class AuthV3 {
    public static void main(String[] args) {
        System.out.println("User\t\t\tID\t Authenticated");

        User filip = new User("Filip9696", "stores passwords in plain text");
        System.out.println(filip.username+"\t\t"+filip.pullId()+"\t "+filip.login());

        User fbiOpenUp = new User("FBI_Backdoor", "password123");
        System.out.println(fbiOpenUp.username+"\t"+fbiOpenUp.pullId()+"\t "+fbiOpenUp.login());
    }

    private static String[] usernames = {"FBI_Backdoor", "Filip9696", "ImDaveead", "MythicHunter"};
    private static String[] passwords = {"123password", "stores passwords in plain text", "database gets hacked and users complain", "surprised pikachu"};

    private static int getId(String username) {
        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i])) return i;
        }
        return -1;
    }

    private static class User {
        String username;
        private String password;
        int id = -1;
        private Boolean authenticated = false;

        User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        int pullId() {
            this.id = getId(this.username);
            return this.id;
        }

        boolean login() {
            if (id < 0) {
                pullId();
                if (id < 0) {
                    return false;
                }
            }
            if (this.password.equals(passwords[id])) {
                this.authenticated = true;
            };
            return this.authenticated;
        }

    }
}

