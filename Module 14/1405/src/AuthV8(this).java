import java.util.Arrays;

/**
 * Author: Filip Kin
 * Version: 2019-11-25
 * Description: Authentication object now with an array of User objects
 */
class AuthV8 {
    private String[] usernames = {"FBI_Backdoor", "Filip9696", "ImDaveead", "MythicHunter", "AFifthGuy"};
    private String[] passwords = {"123password", "stores passwords in plain text", "database gets hacked and users complain", "surprised pikachu",  "late night programming"};
    String username;
    private String password;
    int id = -1;
    private Boolean authenticated = false;

    /**
     * Init account using username
     * @param username  User name
     * @param password  User password
     */
    AuthV8(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Init account using id
     * @param id        Array id
     * @param password  User password
     */
    AuthV8(int id, String password) {
        this.id = id;
        this.username = usernames[id];
        this.password = password;
    }

    /**
     * Get account id from array
     * @return  id number
     */
    int pullId() {
        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i])) {
                this.id = i;
                return i;
            }
        }
        this.id = -1;
        return -1;
    }

    /**
     * Try to login
     * @return  returns true if login successful
     */
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

    /**
     * Allow a user to change their password if they're logged in
     * @param password New password
     */
    void resetPassword(String password) {
        if (this.authenticated) {
            passwords[this.id] = password;
        }
    }

    /**
     * Send a password reset email to the user
     */
    void resetPassword() {
        passwords[this.id] = Integer.toHexString((int) (Math.random()*10000));
        // Pretend like we send an email to the user with their new password
    }

    /**
     * Returns a string representation of the object
     */
    public String toString() {
        return "{\nusernames: "+Arrays.toString(usernames)+",\npasswords: "+Arrays.toString(passwords)+",\nusername: "+
                username+",\npassword: "+password+",\nid: "+id+",\nauthenticated: "+authenticated+"\n}";
    }

}
