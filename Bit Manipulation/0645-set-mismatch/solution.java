class Solution {
    public int[] findErrorNums(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        int duplicate = 0;
        int missing = 0;

        for(int i = 1 ; i <= nums.length ; i++){
            if(!map.containsKey(i)){
                missing = i;
            }else if(map.get(i) == 2){
                duplicate = i;
            }
        }
        return new int[]{duplicate ,  missing};
    }
}