class Solution {
    public String countAndSay(int n) {
         if (n == 1) return "1";

        String result = "1";

        for (int i = 2; i <= n; i++) {
            Queue<Character> queue = new LinkedList<>();
            for (char ch : result.toCharArray()) {
                queue.offer(ch);  
            }

            StringBuilder sb = new StringBuilder();
            while (!queue.isEmpty()) {
                char currentChar = queue.poll();
                int count = 1;


                while (!queue.isEmpty() && queue.peek() == currentChar) {
                    queue.poll();
                    count++;
                }

                sb.append(count).append(currentChar); 
            }

            result = sb.toString(); 
        }

        return result;
    }
}