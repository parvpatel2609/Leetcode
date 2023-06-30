class Solution {
    public int binarySearch(int arr[], int first, int last, int key){  
        int mid = (first+last)/2;  
        while( first<=last){  
            if (arr[mid]<key){  
                first=mid+1;     
            }
            else if(arr[mid] == key ){  
                return mid; 
            }else{  
                last = mid - 1;  
            }  
            mid = (first+last)/2;  
        }
        return -1;
    }  

    public int index_greater_val(int[] arr, int target){
        
        // System.out.println(Arrays.toString(arr) + " hel " + target);
        for(int i=0; i<arr.length; i++){
            // System.out.println(arr[i] + " ron " + target);
            if(arr[i]>target){
                target = arr[i];
                // System.out.println(arr[i] + " in if " + target);
                return binarySearch(arr, 0, arr.length-1, target);
            }
        }
        return -1;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int[] arr = new int[letters.length];
        int t = (int) target;
        

        for(int i=0; i<arr.length; i++){
            arr[i] = (int) letters[i];
        }

        int ans = index_greater_val(arr, t);
        // System.out.println(ans);

        if(ans == -1){
            return letters[0];
        }
        else{
            return letters[ans];
        }
    }
}
