class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            st1.add(nums1[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j =0;j<nums2.length;j++){
            if(st1.contains(nums2[j])){
                ans.add(nums2[j]);
                st1.remove(nums2[j]);
            }
        }
            int [] result = new int[ans.size()];
            for(int k =0;k<ans.size();k++){
                result[k] = ans.get(k);
            }
        return result;
    }
}