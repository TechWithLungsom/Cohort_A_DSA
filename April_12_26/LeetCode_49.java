package April_12_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            char tempVal[] = strs[i].toCharArray();
            Arrays.sort(tempVal);
            String str = String.valueOf(tempVal);

            if(map.get(str) != null) {
                List<String> val = map.get(str);
                val.add(strs[i]);
                map.put(str, val);
            } else {
                List<String> newVal = new ArrayList<>();
                newVal.add(strs[i]);
                map.put(str, newVal);
            }
        }

        for(Map.Entry<String, List<String>> val: map.entrySet()) {
            ans.add(val.getValue());
        }

        return ans;
    }
}
