import java.util.ArrayList;

/**
 * Finds prime numbers in range
 * 
 * @author Filip Kin
 * @version 2020-03-26
 */

class PrimeNumbers {
    int lowerLimit, upperLimit;
    ArrayList<Integer> primes = new ArrayList<Integer>();

    /**
     * Default PrimeNumbers constructor
     * 
     * @param lowerLimit    Minimum of range to look in
     * @param upperLimit    Maximum of range to look in
     */
    PrimeNumbers(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    /**
     * Find primes
     * 
     * @return ArrayList of all the primes within the range
     */
    public ArrayList<Integer> findPrimes() {
        for (int i = lowerLimit; i <= upperLimit; i++) { // Iterate through each number in the range
            boolean prime = true;
            for (int j = 2; j < i; j++) { // Iterate through each possible number that could be a factor
                if (i%j == 0) { // If remainder of division is 0, than it's not a prime number
                    prime = false;
                    break;
                }
            }
            if (i == 0) prime = false;
            if (prime) primes.add(i);
        }
        return primes;
    }

    /**
     * Get previously generated list of primes
     * 
     * @return  ArrayList of all the primes within the range
     */
    public ArrayList<Integer> getPrimes() {
        return primes;
    }
}