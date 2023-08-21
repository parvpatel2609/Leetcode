class Solution {
    public int sumBase(int n, int k) {
        String str = Integer.toString(Integer.parseInt(Integer.toString(n), 10), k);
        System.out.println(str);
        int sum =0;
        for(int i=0; i<str.length(); i++){
            int digit = Character.getNumericValue(str.charAt(i));
            sum += digit;
        }
        return sum;
    }
}
