/**
 * Author: Filip Kin
 * Version: 2019-11-20
 * Description: Creates a user object to log people in
 */
class AuthV3 {
    private static String[] usernames = {"FBI_Backdoor", "Filip9696", "ImDaveead", "MythicHunter"};
    private static String[] passwords = {"123password", "stores passwords in plain text", "database gets hacked and users complain", "surprised pikachu"};
    String username;
    private String password;
    int id = -1;
    private Boolean authenticated = false;

    AuthV3 (String username, String password) {
        this.username = username;
        this.password = password;
    }

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