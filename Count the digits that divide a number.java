class Solution {
    public int countDigits(int num) {
        // ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        int val = num;
        while(val>0){
            int reminder = val % 10 ;
            if(num % reminder == 0){
                count++;
            }
            val /= 10;
        }
        return count;
    }
}