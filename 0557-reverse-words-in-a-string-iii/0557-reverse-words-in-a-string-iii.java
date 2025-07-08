class Solution {
    public String reverseWords(String s) {
        String[] st =s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String ss : st){
            StringBuilder rev =  new StringBuilder(ss).reverse();
            sb.append(rev +" ");
        }
        return sb.toString().trim();

    }
}