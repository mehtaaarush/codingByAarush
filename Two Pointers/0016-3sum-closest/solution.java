class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        
        int closestSum = 0;
        for(int k = 0 ; k < nums.length - 2; k++){
            for(int i = k + 1 ; i < nums.length - 1; i++){
                for(int j = i + 1 ; j < nums.length ; j++){
                    int sum = nums[k] + nums[i] + nums[j];
                    
                    if(Math.abs(sum - target) < min){
                        min = Math.abs(sum - target);
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
    }
}