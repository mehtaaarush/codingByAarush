class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        int maxFreq = 0;
        for(int freq : map.values()){
            maxFreq = Math.max(freq , maxFreq);
        }

        int answer = 0;
        for(int freq : map.values()){
            if(freq==maxFreq){
                answer += maxFreq;
            }
        }
        return answer;
        
    }
}