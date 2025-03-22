class Solution {
    public int maxSubArray(int[] nums) {
        int Currentsum = 0;
        int Maximumsum = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            int temp = Currentsum + nums[i];
            if(temp<nums[i]){
                Currentsum = nums[i];
            }
            else {
                Currentsum = temp;
            }
            if(Maximumsum < Currentsum){
                Maximumsum = Currentsum;
            }
        }
        return Maximumsum;
    }
}