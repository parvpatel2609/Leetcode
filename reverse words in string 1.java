class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String[] arr = s.split(" ");

        String[] res = new String[arr.length];
        int index = arr.length-1;
        for(int i=0; i<arr.length; i++){
            res[i] = arr[index];
            index--;
        }

        String str = "";
        for(int i=0; i<res.length; i++){
            str += res[i];
            if(i!= res.length-1){
                str += " ";
            }
        }
        return str;
    }
}