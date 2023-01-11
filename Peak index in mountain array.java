class Solution {

    public int arr_max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public int index(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public int peakIndexInMountainArray(int[] arr) {
        int m = arr_max(arr);
        int in = index(arr, m);
        return in;
    }
}