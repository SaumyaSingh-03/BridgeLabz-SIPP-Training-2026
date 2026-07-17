package Hashing;
import java.util.HashMap;

public class FrequencyMap {

    public int mostFrequentErrorCode(int[] codes) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        int bestCode = codes[0];
        int bestCount = 0;

        for (int code : codes) {

            int count;

            if (freq.containsKey(code)) {
                count = freq.get(code) + 1;
            } else {
                count = 1;
            }

            freq.put(code, count);

            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }

        return bestCode;
    }
}