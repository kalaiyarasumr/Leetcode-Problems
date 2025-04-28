import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger one = new BigInteger(num1);
        BigInteger two = new BigInteger(num2);

        BigInteger result = one.multiply(two);

        return result.toString();
    }
}