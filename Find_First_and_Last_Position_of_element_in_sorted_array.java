class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                ans[0] = i;
                break;
            }
            if(i==nums.length-1){
                if(nums[i]==target){
                    ans[0] = i;
                }
                else{
                    ans[0] = -1;
                }
            }
        }
      
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]==target){
                ans[1] = i;
                break;
            }
            if(nums[i]!=target && i==0){
                ans[1] = -1;
            }
        }

        if(nums.length == 0){
            ans[0] = -1;
            ans[1] = -1;
        }

        return ans;
    }
}
