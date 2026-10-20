class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = Integer.MIN_VALUE;
        int n = candies.length;

        for(int i = 0 ; i < n ; i++){
            if(candies[i] > greatest){
                greatest = candies[i];
            }    
        }
        List<Boolean> result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(candies[i] + extraCandies >= greatest){
                result.add(true);
            }else{
                result.add(false);

            }
        }
        return result;
        
    }
}