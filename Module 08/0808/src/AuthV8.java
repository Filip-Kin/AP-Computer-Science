/**
 * Author: Filip Kin
 * Version: 2019-11-21
 * Description: Authentication object now with an array of User objects
 */

public class AuthV8 {
    public static void main(String[] args) {
        User[] arr = {
                new User("Filip9696", "stores passwords in plain text"),
                new User("FBI_Backdoor", "password123"),
                new User(3, "password123"),
                new User(2, "password123"),
                new User("AFifthGuy", "late night programming")
        };
        
        System.out.println("User\t\t\tID\t Authenticated\t\tAction");
        System.out.println("--------------------------------------------------------------------------");

        System.out.println(arr[0].username+"\t\t"+arr[0].pullId()+"\t "+arr[0].login()+"\t\t\t\tNone");

        System.out.println(arr[1].username+"\t"+arr[1].pullId()+"\t "+arr[1].login()+"\t\t\t\tNone");

        System.out.print(arr[2].username+"\t"+arr[2].pullId()+"\t "+arr[2].login()+"\t\t\t\t");
        arr[2].resetPassword("this is the new password");

        System.out.print(arr[3].username+"\t\t"+arr[3].pullId()+"\t "+arr[3].login()+"\t\t\t\t");
        arr[3].resetPassword(); // Forgot the password

        System.out.println(arr[4].username+"\t\t"+arr[4].pullId()+"\t "+arr[4].login()+"\t\t\t\tNone");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for (User user : arr) {
            total += user.id;
            if (user.id > max) max = user.id;
            if (user.id < min) min = user.id;
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Minimum ID: "+min);
        System.out.println("Maximum ID: "+max);
        System.out.print("Average ID: ");
        System.out.printf("%.2f", (double) total/arr.length);

        System.out.println("\n\n"+arr[1].toString());
    }

    private static String[] usernames = {"FBI_Backdoor", "Filip9696", "ImDaveead", "MythicHunter", "AFifthGuy"};
    private static String[] passwords = {"123password", "stores passwords in plain text", "database gets hacked and users complain", "surprised pikachu", "late night programming"};

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
            return this.authenticated;
        }

        /**
         * Allow a user to change their password if they're logged in
         * @param password New password
         */
        void resetPassword(String password) {
            if (this.authenticated) {
                passwords[this.id] = password;
                this.password = password;
                System.out.println("Password changed");
            }
            System.out.println("Not logged in, cannot change password");
        }

        /**
         * Send a password reset email to the user
         */
        void resetPassword() {
            passwords[this.id] = Integer.toHexString((int) (Math.random()*10000));
            this.password = passwords[this.id];
            System.out.println("Password reset email sent");
            // Pretend like we send an email to the user with their new password
        }
    }
}