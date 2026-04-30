package April_15_26;

import java.util.Arrays;

public class LeetCode_1552 {
    public boolean canPlace(int position[], int minForce, int m) {
        int count = 1;
        int lastPos = position[0];

        for(int i=1; i<position.length; i++) {
            int force = Math.abs(position[i] - lastPos);

            if(force >= minForce) {
                count++;
                lastPos = position[i];
            }

            if(count == m) return true;
        }

        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low = 1;
        int ans = 0;
        int high = position[n-1] - position[0];

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(canPlace(position, mid, m)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }

        return ans;
    }
}
