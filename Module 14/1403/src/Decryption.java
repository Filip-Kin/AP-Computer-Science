/**
 * Decrypts strings using the caeser cipher
 * 
 * @author Filip Kin
 * @version 2020-03-17
 */

class Decryption {
    /**
     * Decrypts a string using the caeser cipher
     * 
     * @param shiftedAlphabet   Array of letters shifted
     * @param message           String to decrypt
     * @return                  Decrypted string
     */
    public static String decrypt(char[] shiftedAlphabet, String message) {
        String out = "";
        String stringAlphabet = new String(shiftedAlphabet);

        for (char c : message.toLowerCase().toCharArray()) {
            out += (stringAlphabet.indexOf(c) < 0) ? c:Encryption.alphabet[stringAlphabet.indexOf(c)];
        }

        return out;
    }
}