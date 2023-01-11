class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        for(int i=0; i<ans.length; i++){
            if(i==0){
                ans[i] = first;
            }
            else{
                ans[i] = ans[i-1] ^ encoded[i-1];
            }
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }
}