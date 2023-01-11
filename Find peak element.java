class Solution {

    public int arr_max(int[] nums){
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    public int index(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public int findPeakElement(int[] nums) {
        int max = arr_max(nums);
        int in = index(nums, max);
        return in;
    }
}