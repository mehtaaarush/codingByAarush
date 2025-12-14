class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ExpectedSum = (n*(n+1))/2;

        int ActualSum = 0;
        for(int num:nums){
            ActualSum = ActualSum + num;
        } 
        return ExpectedSum - ActualSum;
    }
}