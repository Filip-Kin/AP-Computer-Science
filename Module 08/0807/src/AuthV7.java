/**
 * Author: Filip Kin
 * Version: 2019-11-21
 * Description: Authentication object now with password resetting
 */

public class AuthV7 {
    public static void main(String[] args) {
        System.out.println("User\t\t\tID\t Authenticated\t\tAction");

        User filip = new User("Filip9696", "stores passwords in plain text");
        System.out.println(filip.username+"\t\t"+filip.pullId()+"\t "+filip.login()+"\t\t\t\tNone");

        User fbiOpenUp = new User("FBI_Backdoor", "password123");
        System.out.print(fbiOpenUp.username+"\t"+fbiOpenUp.pullId()+"\t "+fbiOpenUp.login()+"\t\t\t\t");

        User hunter = new User(3, "password123");
        System.out.print(hunter.username+"\t"+hunter.pullId()+"\t "+hunter.login()+"\t\t\t\t");
        hunter.resetPassword("this is the new password");

        User david = new User(2, "password123");
        System.out.print(david.username+"\t\t"+david.pullId()+"\t "+david.login()+"\t\t\t\t");
        david.resetPassword(); // Forgot the password
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

        /**
         * Init account using username
         * @param username  User name
         * @param password  User password
         */
        User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        /**
         * Init account using id
         * @param id        Array id
         * @param password  User password
         */
        User(int id, String password) {
            this.id = id;
            this.username = usernames[id];
            this.password = password;
        }

        /**
         * Get account id from array
         * @return  id number
         */
        int pullId() {
            this.id = getId(this.username);
            return this.id;
        }

        /**
         * Try to login
         * @return  returns true if login successful
         */
        boolean login() {
            if (id < 0) {
                pullId();
                if (id < 0) {
                    System.out.println("Username not found");
                    return false;
                }
            }
            if (this.password.equals(passwords[id])) {
                this.authenticated = true;
            };
            System.out.println("Incorrect password");
            return this.authenticated;
        }

        /**
         * Allow a user to change their password if they're logged in
         * @param password New password
         */
        void resetPassword(String password) {
            if (this.authenticated) {
                passwords[this.id] = password;
                System.out.println("Password changed");
            }
            System.out.println("Not logged in, cannot change password");
        }

        /**
         * Send a password reset email to the user
         */
        void resetPassword() {
            passwords[this.id] = Integer.toHexString((int) (Math.random()*10000));
            System.out.println("Password reset email sent");
            // Pretend like we send an email to the user with their new password
        }

    }
}
