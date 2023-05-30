class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        int[] ans = new int[n+1];
        ans[0] = 0;
        
        for(int i=0; i<arr.length; i++){
            int count = 0;
            String bin = Integer.toBinaryString(arr[i]);
            System.out.println(bin);

            for(int p=0; p<bin.length(); p++){
                if(bin.charAt(p)=='1'){
                    count++;
                }
            }
            ans[i+1] = count;
        }

        // System.out.println(Arrays.toString(ans));

        return ans;
    }
}
