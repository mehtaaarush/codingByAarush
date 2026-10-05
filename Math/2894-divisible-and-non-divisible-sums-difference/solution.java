class Solution {
    public int differenceOfSums(int n, int m) {
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = i+1;
        }
        int num1 = 0;
        int num2 = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % m != 0){
                num1 += arr[i];
            }else{
                num2 += arr[i];
            }
        }
        return num1 - num2;
    }
}