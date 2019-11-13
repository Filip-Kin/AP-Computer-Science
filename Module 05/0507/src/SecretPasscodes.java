import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SecretPasscodes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        File pF = new File("passwords.txt");
        PrintWriter pW = new PrintWriter(pF);

        System.out.println("Password Generator Menu\n" +
                "[1] a-z A-Z\n" + // 65-90 97-122
                "[2] a-z A-Z 0-9\n" + // 48-57 65-90 97-122
                "[3] a-z A-Z 0-9 ;:<>=?@\n" + // 48-90 97-122
                "[4] a-z A-Z 0-9 ;:<>=?@\\^_`~[]{}|\n" + // 48-126
                "[5] Quit\n");

        int lvl = 0;
        int passwordsGenerated = 0;
        while (lvl != 5) {
            lvl = menu(in);

            if (lvl != 5) {
                int len = length(in);
                StringBuilder password = new StringBuilder();
                for (int i = 0; i < len; i++) {
                    password.append(generate(lvl));
                }
                System.out.println("\n"+password.length()+" character password generated.");
                pW.println(password);
                passwordsGenerated++;
            }
        }

        pW.close();
        if (passwordsGenerated == 0) {
            System.out.println("\n\nThank you for trying the password generator.");
        } else {
            Scanner pR = new Scanner(pF);
            System.out.println("\n\nThank you for using the password generator, here are your passwords\n");
            while (pR.hasNext()) {
                System.out.println(pR.nextLine());
            }
        }
    }

    private static int menu(Scanner in) {
        String lvl = "";
        while (true) {
            System.out.print("Please enter a selection: ");
            lvl = in.nextLine();
            switch (lvl) {
                case "1":
                case "2":
                case "3":
                case "4":
                    return Integer.parseInt(lvl);
                case "5":
                    return 5;
                default:
                    System.out.println(lvl+" is not a valid selection");
                    break;
            }
        }
    }

    private static int length(Scanner in) {
        System.out.print("Please enter the length of your password (Min 6): ");
        String lenS = in.nextLine();
        int len = Integer.parseInt(lenS);
        while (len < 6) {
            System.out.print(lenS+" is less than 6, please enter a password length 6 characters or more: ");
            lenS = in.nextLine();
            len = Integer.parseInt(lenS);
        }
        return len;
    }

    private static char generate(int lvl) {
        int min = 64;
        int max = 123;
        if (lvl>1) min = 47;
        int i = 0;
        while (true) {
            i++;
            int n = (int) (Math.random()*(max - min) + min);
            //System.out.println(i+" "+n+" "+(char) n+" "+(n>64&&n<91)+" "+(n>96&&n<123));
            switch (lvl) {
                case 1:
                    if ((n>64&&n<91)||(n>96&&n<123)) return (char) n;
                    break;
                case 2:
                    if ((n>47&&n<58)||(n>64&&n<91)||(n>96&&n<123)) return (char) n;
                    break;
                case 3:
                    if ((n>47&&n<91)||(n>96&&n<123)) return (char) n;
                    break;
                case 4:
                    if (n>47&&n<123) return (char) n;
                    break;
            }
        }
    }
}
