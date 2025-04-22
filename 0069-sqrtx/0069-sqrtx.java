class Solution {
    public int mySqrt(int x) {
        int st =1;
        int ed = x;

        while(st<=ed){
            int mid = st + (ed - st) / 2;
            long sq = (long) mid*mid;
            if(sq == x){
                return mid;
            }
            if(sq>x){
                ed = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return ed;
    }
}