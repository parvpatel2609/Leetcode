class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag = true;

        if(nums[0] > nums[nums.length-1]){
            flag = false;
        }

        if(nums[0] < nums[nums.length-1]){
            flag = true;
        }

        for(int i=0; i<nums.length-1; i++){
            if(flag == true){
                if(nums[i] > nums[i+1]){
                    return false;
                }
            }
            if(flag == false){
                if(nums[i] < nums[i+1]){
                    return false;
                }
            }
        }

        return true;
    }
}
