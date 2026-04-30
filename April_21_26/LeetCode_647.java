package April_21_26;

public class LeetCode_647 {
    public int checkPalindrome(String str, int left, int right) {
        int count = 0;

        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            count++;
            left--;
            right++;
        }

        return count;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for(int i=0; i<n; i++) {
            count += checkPalindrome(s,i,i);
            count += checkPalindrome(s,i,i+1);
        }

        return count;
    }
}
