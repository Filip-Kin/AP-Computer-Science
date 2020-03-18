/**
 * Encrypts strings using the caeser cipher
 * 
 * @author Filip Kin
 * @version 2020-03-17
 */

class Encryption {

    public static final char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    
    /**
     * Shifts an alphabet array
     * 
     * @param alphabet  Array of letters in alphabet
     * @param shift     Number of places to shift by
     * @return          Shifted alphabet
     */
    public static char[] shiftAlphabet(int shift) {
        char[] out = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            int newPos = i + shift;
            if (newPos > alphabet.length-1) newPos -= alphabet.length;
            out[newPos] = alphabet[i];
        }
        return out;
    }

    /**
     * Encrypts a string using the caeser cipher
     * 
     * @param shiftedAlphabet   Array of letters shifted
     * @param message           String to encrypt
     * @return                  Encrypted string
     */
    public static String encrypt(char[] shiftedAlphabet, String message) {
        String out = "";
        String stringAlphabet = new String(alphabet);

        for (char c : message.toLowerCase().toCharArray()) {
            out += (stringAlphabet.indexOf(c) < 0) ? c:shiftedAlphabet[stringAlphabet.indexOf(c)];
        }

        return out;
    }
}
