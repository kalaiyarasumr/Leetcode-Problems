class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int start=0;
        int end = start+2;
        int count=0;
        while(end<n){
            if(nums[start]+nums[end]==nums[start+1]/2 && nums[start+1]%2==0)count++;
            start++;
            end++;
        }
        return count;
    }
}