class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        int len = hs.size();

        int[] arr = new int[len];
        int i=0;
        for(int ele:hs){
          arr[i++] = ele;
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        if(arr.length==1){
            return arr[0];
        }

        else if(arr.length==2){
            return arr[1];
        }

        else{
            return arr[arr.length-3];
        }
    }
}