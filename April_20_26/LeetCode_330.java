package April_20_26;

public class LeetCode_330 {
    public int minPatches(int[] nums, int n) {
        long maxReach = 0;
        int patch = 0;
        int indx = 0;

        while(maxReach < n) {
            if(indx < nums.length && nums[indx] <= maxReach + 1) {
                maxReach += nums[indx];
                indx++;
            } else {
                maxReach += (maxReach + 1);
                patch++;
            }
        }

        return patch;
    }
}
