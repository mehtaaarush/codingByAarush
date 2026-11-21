class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
    for(int j = 0 ; j < heights.length - 1 ; j++){
        for(int i = 0 ; i < heights.length - 1 - j ; i++){
            if(heights[i] < heights[i+1]){
                int temp = heights[i];
                heights[i] = heights[i+1];
                heights[i+1] = temp;

                String tempo = names[i];
                names[i] = names[i+1];
                names[i+1] = tempo;
            }
        }
    }
        return names;
    }
}