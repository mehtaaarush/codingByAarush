class Solution {

    public int amount(int[] nums, int i, int[] dp, int n){
        if(i >= n) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i] + amount(nums, i + 2, dp, n);
        int skip = amount(nums, i + 1, dp, n);
        
        return dp[i] = Math.max(take, skip);
    }
    
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        
        return amount(nums, 0, dp, n);
    }
}