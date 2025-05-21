class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> list = new ArrayList<>();
    for(int k = 0;k<words[0].length();k++){
        int c = 1;
       for(int i = 1;i<words.length;i++){
         for(int j = 0;j<words[i].length();j++){  
             if(words[0].charAt(k) == words[i].charAt(j)){
                 c++;
                 words[i] = words[i].substring(0,j)+""+words[i].substring(j+1);
                 break;
             }
         }
      }
        if(c == words.length) list.add(words[0].charAt(k)+""); 
    } 
    return list;
    }
}