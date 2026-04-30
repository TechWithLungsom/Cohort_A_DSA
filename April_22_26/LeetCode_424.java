package April_22_26;

public class LeetCode_424 {
    public int characterReplacement(String s, int k) {
        int counts[] = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {
            int currIndx = s.charAt(right) - 'A';
            counts[currIndx]++;

            maxFreq = Math.max(maxFreq, counts[currIndx]);

            if((right - left + 1) - maxFreq > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
