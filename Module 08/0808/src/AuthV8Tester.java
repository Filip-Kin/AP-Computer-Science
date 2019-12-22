/**
 * Author: Filip Kin
 * Version: 2019-11-25
 * Description: Tests the AuthV8 class
 */
public class AuthV8Tester {
    public static void main(String[] args) {
        AuthV8[] arr = {
                new AuthV8("Filip9696", "stores passwords in plain text"),
                new AuthV8("FBI_Backdoor", "password123"),
                new AuthV8(3, "password123"),
                new AuthV8(2, "password123"),
                new AuthV8("AFifthGuy", "late night programming")
        };
        
        System.out.printf("%-20s", "User");
        System.out.printf("%-5s", "ID");
        System.out.printf("%-1s%n", "Authenticated");
        System.out.printf("%s%n", "======================================");

        System.out.printf("%-20s", arr[0].username);
        System.out.printf("%-5s", arr[0].pullId());
        System.out.printf("%-1s%n", arr[0].login());

        System.out.printf("%-20s", arr[1].username);
        System.out.printf("%-5s", arr[1].pullId());
        System.out.printf("%-1s%n", arr[1].login());

        System.out.printf("%-20s", arr[2].username);
        System.out.printf("%-5s", arr[2].pullId());
        System.out.printf("%-1s%n", arr[2].login());
        arr[2].resetPassword("this is the new password");

        System.out.printf("%-20s", arr[3].username);
        System.out.printf("%-5s", arr[3].pullId());
        System.out.printf("%-1s%n", arr[3].login());
        arr[3].resetPassword();

        System.out.printf("%-20s", arr[4].username);
        System.out.printf("%-5s", arr[4].pullId());
        System.out.printf("%-1s%n", arr[4].login());
        arr[4].resetPassword();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for (AuthV8 user : arr) {
            total += user.id;
            if (user.id > max) max = user.id;
            if (user.id < min) min = user.id;
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("Minimum ID: ");
        System.out.printf("%5d%n", min);
        System.out.print("Maximum ID: ");
        System.out.printf("%5d%n", max);
        System.out.print("Average ID: ");
        System.out.printf("%.2f", (double) total/arr.length);

        System.out.println("\n\n"+arr[1].toString());
    }

}