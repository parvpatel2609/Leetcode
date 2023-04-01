import java.util.Arrays;

class Solution {

    public int check(int[] nums, int start, int end, int target){
        if(end>=start){
            int mid = start+(end-start)/2;
            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid])
                return check(nums, start, mid-1, target);
            else if(target > nums[mid])
                return check(nums, mid+1, nums.length-1, target);
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        // int index = Arrays.binarySearch(nums,target);
        // return index;
        int start = 0;
        int end = nums.length-1;

        int in = check(nums, start, end, target);
        return in;
    }
}
