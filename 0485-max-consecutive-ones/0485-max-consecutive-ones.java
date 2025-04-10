class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, curCount = 0;

        for (int i = 0; i <= nums.length; i++) {
            if (i == nums.length || nums[i] == 0) {
                if (curCount > max) {
                    max = curCount;
                }
                curCount = 0;
            } else {
                curCount++;
            }
        }

        return max;
    }
}