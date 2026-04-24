package April_09_26;

public class LeetCode_7 {
    public static int reverse(int x) {
        int reverse = 0;

        while(x != 0) {
            int lastDigit = x % 10;

            if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && lastDigit > 7)) {
                return 0;
            }

            if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && lastDigit < -8)){
                return 0;
            }

            reverse = reverse * 10 + lastDigit;
            x /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
