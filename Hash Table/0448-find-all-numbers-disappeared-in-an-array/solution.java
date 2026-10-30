class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        for(int i = 1 ; i <=nums.length ; i++){
            if(!map.containsKey(i)){
                arr.add(i);
            }
        }
        return arr;

    }
}