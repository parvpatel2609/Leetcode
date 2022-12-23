class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> s = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i==1){
                s.add(Integer.toString(i));
            }
            else if(i%3==0){
                if(i%5==0){
                    s.add("FizzBuzz");
                }
                else{
                    s.add("Fizz");
                }
            }
            else if(i%5==0){
                if(i%3!=0){
                    s.add("Buzz");
                }
            }
            else{
                s.add(Integer.toString(i));
            }
        }
        return s;
    }
}