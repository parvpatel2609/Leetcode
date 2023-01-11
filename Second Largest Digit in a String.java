import java.util.*;

class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int val = Character.getNumericValue(s.charAt(i));
                System.out.println(val);
                hs.add(val);
            }
        }

        ArrayList<Integer> al = new ArrayList<>(hs);

        Collections.sort(al);   

        System.out.println(al);

        if(al.size()>=2){
            return al.get(al.size()-2);
        }
        else{
            return -1;
        }
        // int len = hs.size();
        // int[] ans = hs.toArray(new int[len]);
        
        // Arrays.sort(ans);

        // System.out.println(Arrays.toString(ans));

        // if(len >= 2){
        //     return ans[ans.length-2];
        // }
        // else{
        //     return -1;
        // }
    }
}