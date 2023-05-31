class Solution {
    public int minPartitions(String n) {
        int[] arr = new int[n.length()];

        for(int i=0; i<arr.length; i++){
            arr[i] = Character.getNumericValue(n.charAt(i));
        }

        Arrays.sort(arr);

        return arr[arr.length-1];
    }
}
