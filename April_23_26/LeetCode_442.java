package April_23_26;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n; i++) {
            int indx = Math.abs(nums[i]) - 1;

            if(nums[indx] < 0) {
                ans.add(Math.abs(nums[i]));
            } else {
                nums[indx] = -nums[indx];
            }
        }

        return ans;
    }
}
