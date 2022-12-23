class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, multi = 1;
        while(n>0){
            int reminder = n % 10;
            n=n/10;
            sum += reminder;
            multi *= reminder;
        }
        int ans = multi - sum;
        return ans;
    }
}