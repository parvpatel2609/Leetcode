class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        boolean flag = false;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j] && i!=j){
                    flag = true;
                    break;
                }
            }
            if(flag){
                flag = false;
                continue;
            }
            else{
                sum += nums[i];
            }
        }
        return sum;
    }
}