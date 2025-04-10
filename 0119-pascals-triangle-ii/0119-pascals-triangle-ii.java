class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for(int i=1;i<=rowIndex;i++){
            long nexvalue = prev * (rowIndex - i+1) / i;
            res.add((int) nexvalue);
            prev = nexvalue;
        }
        return res;
    }
}