class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        Map<Character,Integer> seen = new HashMap<>();
        int start =0;
        for(int end=0;end<s.length();end++){
            char ch = s.charAt(end);
            if(seen.containsKey(ch)){
                start = Math.max(start,seen.get(ch)+1);
            }
            seen.put(ch,end);
            max = Math.max(max,end-start+1);
        }
            return max;
    }
}