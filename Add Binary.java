import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger n1,n2,res;

        n1 = new BigInteger(a,2);
        n2 = new BigInteger(b,2);
        res = n1.add(n2);

        return res.toString(2);
        // int n1 = Integer.parseInt(a,2);
        // int n2 = Integer.parseInt(b,2);
        // int res = Integer.parseInt(String.valueOf(n1+n2));
        // return Integer.toBinaryString(res);
    }
}