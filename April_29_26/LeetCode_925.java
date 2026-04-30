package April_29_26;

public class LeetCode_925 {
    public boolean isLongPressedName(String name, String typed) {
        int m = name.length();
        int n = typed.length();
        int p1 = 0;
        int p2 = 0;

        while(p2 < n) {
            if(p1 < m && name.charAt(p1) == typed.charAt(p2)) {
                p1++;
                p2++;
            } else if(p2 > 0 && typed.charAt(p2) == typed.charAt(p2-1)) {
                p2++;
            } else {
                return false;
            }
        }

        return p1 == m;
    }
}
