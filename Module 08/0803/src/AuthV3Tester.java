public class AuthV3Tester {
    public static void main(String[] args) {
        System.out.printf("%-20s", "User");
        System.out.printf("%-5s", "ID");
        System.out.printf("%-1s%n", "Authenticated");
        System.out.printf("%s%n", "======================================");

        AuthV3 filip = new AuthV3("Filip9696", "stores passwords in plain text");
        System.out.printf("%-20s", filip.username);
        System.out.printf("%-5s", filip.pullId());
        System.out.printf("%-1s%n", filip.login());

        AuthV3 fbiOpenUp = new AuthV3("FBI_Backdoor", "password123");
        System.out.printf("%-20s", fbiOpenUp.username);
        System.out.printf("%-5s", fbiOpenUp.pullId());
        System.out.printf("%-1s%n", fbiOpenUp.login());
    }

}
