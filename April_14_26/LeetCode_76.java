package April_14_26;

public class LeetCode_76 {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.length() < t.length()) return "";

        int left = 0;
        int right = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int startIndx = 0;

        int map[] = new int[128];

        for(char ch: t.toCharArray()) map[ch]++;


        while(right < s.length()) {
            char rightChar = s.charAt(right);

            if(map[rightChar] > 0) {
                count--;
            }

            map[rightChar]--;
            right++;

            while(count == 0) {
                if(right - left < minLen) {
                    minLen = right - left;
                    startIndx = left;
                }

                char leftChar = s.charAt(left);
                map[leftChar]++;

                if(map[leftChar] > 0) {
                    count++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndx, startIndx + minLen);
    }
}
