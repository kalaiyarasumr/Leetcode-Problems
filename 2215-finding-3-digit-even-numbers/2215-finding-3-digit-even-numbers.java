class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> result = new TreeSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    if (i != j && j != k && i != k) {
                        int a = digits[i], b = digits[j], c = digits[k];
                        int num = a * 100 + b * 10 + c;
                        if (a != 0 && num % 2 == 0)
                            result.add(num);
                    }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}