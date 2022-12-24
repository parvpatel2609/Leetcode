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
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }

    public int dominantIndex(int[] nums) {
        int max = arr_max(nums);
        int in = index(nums, max);

        System.out.println("Max : " + max);
        System.out.println("Index : " + in);

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]*2);
            if(nums[i]*2 > max && nums[i]!=max){
                return -1;
            }
        }
        return in;
    }
}