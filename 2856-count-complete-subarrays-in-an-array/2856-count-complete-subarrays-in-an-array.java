class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> arr = new HashSet<>();
        for(int num: nums){
            arr.add(num);
        }
        int total = arr.size();
        int c=0;
        for(int i=0;i<n;i++){
            Set<Integer> subarray = new HashSet<>();
            for(int j=i;j<n;j++){
                subarray.add(nums[j]);
                 if(subarray.size()==total){
                 c++;
                 }
            }
        }
            return c;
    }
}