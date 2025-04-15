class Solution {
    public String sortSentence(String s) {
        String[] arr =s.split(" ");
        String[] balance = new String[arr.length];
        for(String word : arr){
            int temp = word.charAt(word.length()-1)-'1';
            balance[temp] =word.substring(0,word.length()-1);
        }
        return String.join(" ",balance);
    }
}