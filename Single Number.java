class Solution {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }

        System.out.println(hm);

//        for (int val: hm.values()){
////            int key_val = hm.get();
//            System.out.println("hello "+val);
//            if(val==1){
//                return hm.get;
//            }
//        }
//        return -1;

        for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue() == 1) {
                return entry.getKey();
//                System.out.println("The key for value " + value + " is " + entry.getKey());
//                break;
            }
        }
        return -1;
    }
}