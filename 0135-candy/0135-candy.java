class Solution {
    public int candy(int[] ratings) {
         int n = ratings.length;
        int[] incLeft = new int[n];
        int[] incRight = new int[n];

        for (int i = 0; i < n - 1; i++) {
            if (ratings[i] < ratings[i + 1]) {
                incRight[i + 1] = incRight[i] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                incLeft[i] = incLeft[i + 1] + 1;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            count += 1 + Math.max(incLeft[i], incRight[i]);
        }

        return count;
    }
}