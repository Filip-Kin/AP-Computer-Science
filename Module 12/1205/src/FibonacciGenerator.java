/**
 * @purpose Fibonacci sequence generator
 * @author Filip Kin
 * @version 2020-02-19
 */

public class FibonacciGenerator {
    /**
     * Private method that actually is the piecewise function
     *
     * @param n Last fibonacci value
     * @return New Fibonacci value
     */
    public int findFibonacciValue(int n) {
        if (n<2) return (n == 1) ? 1:0;
        return findFibonacciValue(n-1) + findFibonacciValue(n-2);
    }
}
