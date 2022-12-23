class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        // int index_i = 0, index_j = 0;
        boolean flag = false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    // index_i = i;
                    // index_j = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        // result[0] = index_i;
        // result[1] = index_j;
        return result;
    }
}