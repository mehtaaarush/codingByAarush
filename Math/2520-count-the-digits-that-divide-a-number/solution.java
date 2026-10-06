class Solution {
    public int countDigits(int num) {
        String s = Integer.toString(num);
        int[] arr = new int[s.length()];
        int count = 0;

        for(int i = 0 ; i < s.length() ; i++){
            arr[i] = s.charAt(i) - '0';
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(num % arr[i]==0){
                count += 1;
            }
        }  
        return count;  
        }
               
    }