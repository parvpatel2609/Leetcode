class Solution {

    // public boolean check_digit(int[] nums, int target){
    //     for(int i=0; i<nums.length; i++){
    //         if(nums[i] == target){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public List<Integer> findDisappearedNumbers(int[] nums) {
    //     List<Integer> ls = new ArrayList<>();
    //     for(int i=0; i<nums.length; i++){
    //         if(!check_digit(nums, i+1)){
    //             ls.add(i+1);
    //         }
    //     }
    //     return ls;

        List<Integer> ans = new ArrayList<Integer>();
        for( int i=0;i< nums.length; i++){
            int index = nums[i];
            if(nums[Math.abs(index)-1] > 0){
                nums[Math.abs(index)-1]= -nums[Math.abs(index)-1];
            }
        }
        
        for(int j =1 ;j <= nums.length ; j++){
            if(nums[j-1] > 0){
                ans.add(j);
            }
        }
        return ans;
    }
    
}