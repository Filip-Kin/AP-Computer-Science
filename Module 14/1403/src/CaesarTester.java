/**
 * Tests the encryption and decryption classes
 * 
 * @author Filip Kin
 * @version 2020-03-17
 */

import java.util.Scanner;

class CaesarTester {

        public static void main(String[] args) {
        boolean exit = false;
        String response = "";
        Scanner in = new Scanner(System.in);
        while (!exit) {
            System.out.println("How many characters to shift alphabet by (0-25): ");
            final int shift = Integer.parseInt(in.nextLine());
            if (shift > 25 || shift < 0) { 
                System.out.println(shift + " is not within range 0-25!");
            } else {
                System.out.println("\nAlphabets:");
                System.out.println(Encryption.alphabet);
                char[] shiftedAlphabet = Encryption.shiftAlphabet(shift);
                System.out.println(shiftedAlphabet);

                boolean newCipher = false;
                while (!newCipher) {
                    System.out.println("\n[e] Encrypt a message");
                    System.out.println("[d] Decrypt a message");
                    System.out.println("[n] New cipher");
                    System.out.println("[q] Quit");
                    response = in.nextLine();
                    
                    if (response.equalsIgnoreCase("e")) {
                        System.out.println("Enter a message to encrypt: ");
                        String message = in.nextLine();
        
                        System.out.println("Encrypted message: " + Encryption.encrypt(shiftedAlphabet, message));
                    } else if (response.equalsIgnoreCase("d")) {
                        System.out.println("Enter a message to decrypt: ");
                        String message = in.nextLine();
        
                        System.out.println("Decrypted message: " + Decryption.decrypt(shiftedAlphabet, message));
                    } else if (response.equalsIgnoreCase("q")) {
                        newCipher = true;
                        exit = true;
                        System.out.println("Bye bye!");
                    } else if (response.equalsIgnoreCase("n")) {
                        newCipher = true;
                    } else {
                        System.out.println(response + " is not a valid option!");
                    }
                }
            }
        }
    }
}