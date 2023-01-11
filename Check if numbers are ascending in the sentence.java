class Solution {

    public boolean check_num(String s){
        try{
            int val = Integer.parseInt(s);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        List<Integer> ls = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(check_num(arr[i])){
                ls.add(Integer.parseInt(arr[i]));
            }
        }

        for(int i=0; i<ls.size()-1; i++){
            if(ls.get(i) >= ls.get(i+1)){
                return false;
            }
        }
        return true;
    }
}