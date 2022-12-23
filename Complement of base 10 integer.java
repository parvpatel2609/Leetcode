class Solution {
    public int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        String ans = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                if(i!=0){
                    ans += '0';
                }
                else if(i==0 && str.length()==1){
                    ans += '0';
                }
                else{
                    continue;
                }
            }
            else{
                ans += '1';
            }
        }
        System.out.println(ans);
        int val = Integer.parseInt(ans, 2);
        return val;
    }
}