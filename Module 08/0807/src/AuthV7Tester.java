/**
 * Author: Filip Kin
 * Version: 2019-11-25
 * Description: Tests the AuthV7 class
 */
public class AuthV7Tester {
    public static void main(String[] args) {
        System.out.printf("%-20s", "User");
        System.out.printf("%-5s", "ID");
        System.out.printf("%-1s%n", "Authenticated");
        System.out.printf("%s%n", "======================================");

        AuthV7 filip = new AuthV7("Filip9696", "stores passwords in plain text");
        System.out.printf("%-20s", filip.username);
        System.out.printf("%-5s", filip.pullId());
        System.out.printf("%-1s%n", filip.login());

        AuthV7 fbiOpenUp = new AuthV7("FBI_Backdoor", "password123");
        System.out.printf("%-20s", fbiOpenUp.username);
        System.out.printf("%-5s", fbiOpenUp.pullId());
        System.out.printf("%-1s%n", fbiOpenUp.login());

        AuthV7 hunter = new AuthV7(3, "password123");
        System.out.printf("%-20s", hunter.username);
        System.out.printf("%-5s", hunter.pullId());
        System.out.printf("%-1s%n", hunter.login());
        hunter.resetPassword("this is the new password");
        
        AuthV7 dave = new AuthV7(2, "password123");
        System.out.printf("%-20s", dave.username);
        System.out.printf("%-5s", dave.pullId());
        System.out.printf("%-1s%n", dave.login());
        dave.resetPassword();
    }

}