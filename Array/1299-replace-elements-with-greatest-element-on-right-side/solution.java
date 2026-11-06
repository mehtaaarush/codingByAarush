class Solution {
    public int[] replaceElements(int[] arr) {
        int maxValue = -1;
        //arr[arr.length - 1] = -1;

        for(int i = arr.length - 1 ; i >= 0 ; i--){
            int current = arr[i];

            arr[i] = maxValue;

            maxValue = Math.max(current , maxValue);
             
        }
        
        return arr;
    }
}