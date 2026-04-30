package April_23_26;

import java.util.List;

public class LeetCode_624 {
    public int maxDistance(List<List<Integer>> arrays) {
        int maxDist = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);

        for(int i=1; i<arrays.size(); i++) {
            int currMin = arrays.get(i).get(0);
            int currMax = arrays.get(i).get(arrays.get(i).size() - 1);

            maxDist = Math.max(maxDist, Math.max(Math.abs(currMax - min), Math.abs(max - currMin)));

            min = Math.min(min, currMin);
            max = Math.max(max, currMax);
        }

        return maxDist;
    }
}
