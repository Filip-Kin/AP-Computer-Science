/**
 * Analyzes the number of each character in a string
 * 
 * @author Filip Kin
 * @version 2020-03-26
 */

import java.util.HashMap;

class FrequencyAnalyzer {
    String text;
    boolean percents = false;
    int totalChars = 0;
    HashMap<Character, Double> map = new HashMap<Character, Double>();

    FrequencyAnalyzer(String text) {
        this.text = text;
    }

    public void analyze() {
        for (char i : text.toCharArray()) {
            if (Character.isLetter(i) || Character.isDigit(i)) {
                map.put(i, (map.containsKey(i))?map.get(i)+1:1); // If map doesn't have char yet, set it to 1
                totalChars++;
            }
        }
    }

    public int getTotalChars() {
        return totalChars;
    }

    public HashMap<Character, Double> getMap() {
        return map;
    }

    public void sort() {
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        HashMap<Character, Double> _map = new HashMap<Character, Double>(map);
        // Horribly inefficent sorting algorithum
        while (_map.size() > 0) {
            HashMap.Entry<Character, Double> largest = _map.entrySet().iterator().next();
            for (HashMap.Entry<Character, Double> entry : _map.entrySet()) {
                if (entry.getValue() > largest.getValue()) largest = entry;
            }
            out.append(largest.getKey()+": "+largest.getValue()+((percents)?"%":"")+"\n");
            _map.remove(largest.getKey());
        }
        return out.toString();
    }

    public void toPercents() {
        percents = true;
        for (HashMap.Entry<Character, Double> entry : map.entrySet()) {
            entry.setValue((double) ((int) (entry.getValue()/totalChars*10000))/100);
        }
    }
}