class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int p=0, q=n;
        for(int i=0; i<ans.length; i++){
            if(i%2==0){
                ans[i] = nums[p];
                p++;
            }
            else{
                ans[i] = nums[q];
                q++;
            }
        }
        return ans;
    }
}