class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }

            if(nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        for(int div = smallest; div >= 1; div--) {
            if(smallest % div == 0 && largest % div == 0) {
                return div;
            }
        }

        return 1;
    }
}