package April_25_26;

public class LeetCode_918 {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxKadane = Integer.MIN_VALUE, currentMax = 0;
        int minKadane = Integer.MAX_VALUE, currentMin = 0;

        for (int x : nums) {
            currentMax = Math.max(x, currentMax + x);
            maxKadane = Math.max(maxKadane, currentMax);

            currentMin = Math.min(x, currentMin + x);
            minKadane = Math.min(minKadane, currentMin);

            totalSum += x;
        }

        if (maxKadane < 0) return maxKadane;

        return Math.max(maxKadane, totalSum - minKadane);
    }
}
