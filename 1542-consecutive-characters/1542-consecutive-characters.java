class Solution {
    public int maxPower(String s) {
        int i=0,j=1,max=0,count=1;
        if(s.length()==1)return 1;
        while(j<s.length()){
            count=1;
                i=j-1;
                while(j<s.length()&&s.charAt(j)==s.charAt(j-1)){
                    count++;
                    j++;
                }
                max=Math.max(max,count);
            j++;
        }
        return max;
    }
}