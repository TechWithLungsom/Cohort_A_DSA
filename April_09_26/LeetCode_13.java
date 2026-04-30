package April_09_26;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_13 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int val = 0;
        int n = s.length();

        for(int i=0; i<n; i++) {
            int currVal = map.get(s.charAt(i));
            if(i < n-1 && currVal < map.get(s.charAt(i+1))) {
                val -= currVal;
            } else {
                val += currVal;
            }
        }

        return val;
    }
}
