/**
 * Tests the FrequencyAnalyzer class NOT THE ACTUAL APPLICATION
 * 
 * @author Filip Kin
 * @version 2020-03-26
 */

class FrequencyAnalyzerTester {
    public static void main(String[] args) {
        FrequencyAnalyzer f = new FrequencyAnalyzer("The quick brown fox jumps over the lazy dog");
        f.analyze();
        f.toPercents();
        System.out.println(f.toString());
        System.out.println(f.getTotalChars());
    }
}