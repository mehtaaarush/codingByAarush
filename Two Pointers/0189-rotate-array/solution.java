class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        
        int m = 0;
        int[] arr = new int[nums.length];

        for(int i = nums.length - k ; i < nums.length ; i++){
            arr[m] = nums[i];
            m++;
        }

        for(int i = 0 ; i < nums.length - k ; i++){
            arr[m] = nums[i];
            m++;
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = arr[i];
        }

    }
}