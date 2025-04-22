class Solution {
    public boolean isIsomorphic(String s, String t) {
      if(s.length() != t.length())  return false;

      Map<Character,Character> S= new HashMap<>();
      Map<Character,Character> T = new HashMap<>();

      for(int i=0;i<s.length();i++){
        char chS = s.charAt(i);
        char chT =t.charAt(i);

        if(S.containsKey(chS) && S.get(chS)!= chT){
            return false;
        } 
        if(T.containsKey(chT) && T.get(chT)!= chS){
            return false;
        }

        S.put(chS,chT);
        T.put(chT,chS);
      }
          return true;
    }
}