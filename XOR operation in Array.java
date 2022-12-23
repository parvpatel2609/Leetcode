class Solution {
    public int xorOperation(int n, int start) {
        int val = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = start + 2*i;
        }

        for(int i=0; i<n; i++){
            val ^= arr[i]; 
        }

        return val;
    }
}