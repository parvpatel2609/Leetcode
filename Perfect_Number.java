class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        int val = 2;
        if(num==1)
            return false;
        while(val<num){
            if(num%val==0){
                al.add(val);
            }
            val++;
        }
        int sum = 0;
        for(int i=0; i<al.size(); i++){
            sum+=al.get(i);
        }
        if(sum==num)
            return true;
        else
            return false;
    }
}
