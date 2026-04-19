class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res = 0;
        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <=nums2[j]){
                res = Math.max(res,j-i);
                j++;
            }else{
                i++;
            }

        }
        return res;
//         for(int i = 0 ; i<n;i++){
//             for(int j = i; j<m;j++){
//                 if(nums1[i] <=nums2[j]){
//                     res = Math.max(res,j - i);
//                 }
//             }
//         }
//         return res;
     }
 }