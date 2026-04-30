package April_29_26;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_1023 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        int m = pattern.length();

        for(String query: queries) {
            int p1 = 0;
            int p2 = 0;
            int n = query.length();

            while(p2 < n) {
                if(p1 < m && pattern.charAt(p1) == query.charAt(p2)) {
                    p1++;
                } else if(Character.isUpperCase(query.charAt(p2))) {
                    p1 = -1;
                    break;
                }
                p2++;
            }

            ans.add(p1 == m);
        }

        return ans;
    }
}
