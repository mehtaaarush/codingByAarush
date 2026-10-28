class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int k = 0;

        for(int i = 0 ; i < nums1.length ; i++){
            if(nums1[i] != 0){
                arr[k] = nums1[i];
                k++;
            }
        }
        for(int i = 0 ; i < nums2.length ; i++){
            arr[k] = nums2[i];
            k++;
        }
        for(int i = 0 ; i < arr.length ; i++){
            nums1[i] = arr[i];
        }
        Arrays.sort(nums1);
    }
}