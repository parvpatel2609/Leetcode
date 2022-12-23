class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] result = new int[sentences.length];
        
        for(int i=0; i<sentences.length; i++){
            int count = 0;
            for(int j=0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    count++;
                }
            }
            result[i] = count;
        }

        int max = 0;
        for(int i=0; i<result.length; i++){
            if(max < result[i]){
                max = result[i];
            }
        }

        return max+1;
    }
}