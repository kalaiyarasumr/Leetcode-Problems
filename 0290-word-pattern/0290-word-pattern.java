class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        Map<Character,String> chtowd = new HashMap<>();
        Map<String,Character> wdtoch = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String w = words[i];
        

        if(chtowd.containsKey(c)){
            if(!chtowd.get(c).equals(w)) return false;
        }else{
            if(wdtoch.containsKey(w)) return false;
            chtowd.put(c,w);
            wdtoch.put(w,c);
        }
        }
        return true;
    }
}