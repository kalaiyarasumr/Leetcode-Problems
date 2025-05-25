class Solution {
    public int longestPalindrome(String[] words) {
        boolean found = false;
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> same = new HashMap<String, Integer>();
        int count = 0;
        int maxCount = 0;

        for(String word : words){
            StringBuilder sb = new StringBuilder(word);
            String reversedWord = sb.reverse().toString();
            if(word.charAt(0) != word.charAt(1)){
                if(map.containsKey(reversedWord)){
                    count += 4;
                    map.put(reversedWord, map.getOrDefault(reversedWord, 0) - 1);
                    if(map.get(reversedWord) == 0) map.remove(reversedWord);
                }else{
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }else{                
                if(same.containsKey(word)){
                    count += 4;
                    same.remove(word);
                }else{
                    same.put(word, 1);
                }
            } 
        }

        if(same.size() > 0) count += 2;

        return count;
    }
}