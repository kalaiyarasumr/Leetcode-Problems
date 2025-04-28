class Solution {
    public String largestOddNumber(String num) {
        int n = num.length()-1;
        while(n>=0){
            int digits = num.charAt(n)-'0';
            if(digits%2==1){
                return num.substring(0,n+1);
            }
            n--;
        }
        return "";
    }
}