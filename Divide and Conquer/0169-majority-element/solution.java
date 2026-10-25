class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i] , count + 1);
            }else{
                map.put(nums[i] , 1);
            }
        }

        int maxFreq = 0;
        int maxElement = 0;

        for(int key : map.keySet()){
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
                maxElement = key;
            }
        }
        return maxElement;
    }
}