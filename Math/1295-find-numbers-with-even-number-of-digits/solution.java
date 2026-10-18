class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            while(nums[i] > 0){
                int digit = nums[i] % 10;
                
                count += 1;
                nums[i] = nums[i] / 10;
            }
        
        if(count % 2 == 0){
            even += 1;
        }
    }
    return even;
} 
}