class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int distance = 0;
        for(int i = 0; i<n ; i++){
            for(int j = i+1;j<n;j++){
                if(colors[i]!=colors[j]){
                distance = Math.max(distance,Math.abs(i-j));
                }
            }
        }
        return distance;
    }
}