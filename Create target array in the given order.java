class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<index.length; i++){
            al.add(index[i], nums[i]);
        }

        int[] ans = new int[index.length];

        for(int i=0; i<ans.length; i++){
            ans[i] = al.get(i);
        }

        return ans;
    }
}