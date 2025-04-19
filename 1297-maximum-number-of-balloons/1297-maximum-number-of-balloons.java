class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> st = new HashMap<>();
        st.put('b',0);
        st.put('a',0);
        st.put('l',0);
        st.put('o',0);
        st.put('n',0);

        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(st.containsKey(ch)){
                st.put(ch,st.get(ch) +1);
            }
        }

        int maxBallons = Math.min(st.get('b'),Math.min(st.get('a'),Math.min(st.get('n'),Math.min(st.get('l') / 2,st.get('o') /2))));

        return maxBallons;
    }
}