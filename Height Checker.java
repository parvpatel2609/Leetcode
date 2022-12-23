class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            arr[i] = heights[i];
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(heights));
        
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(arr[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}