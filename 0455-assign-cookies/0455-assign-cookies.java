class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);
       int c =0;
       int i=g.length-1,j=s.length-1;
       while(i>=0 && j>=0){
        if(s[j]>=g[i]){
            c++;
            i--;
            j--;
        }
        else{
            i--;
        }
       } 
       return c;
    }
}