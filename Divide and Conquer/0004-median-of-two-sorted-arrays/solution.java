class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int k = 0;

        int[] arr = new int[n + m];
        for(int i = 0 ; i < n ; i++){
            arr[k] = nums1[i];
            k++;
        }

        for(int i = 0 ; i < m ; i++){
            arr[k] = nums2[i];
            k++;
        }

        Arrays.sort(arr);

        int len = arr.length;

        if(len % 2 == 1){
            int middle = len/2;
            return arr[middle];
        }else{
            int middle1 = len / 2 - 1;
            int middle2 = len / 2;
            return (arr[middle1] + arr[middle2]) / 2.0;
        }
        

    }
}