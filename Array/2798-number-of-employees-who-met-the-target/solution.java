class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int worked = 0;
        for(int i = 0 ; i < hours.length ; i++){
            if(hours[i] >= target){
                worked += 1;
            }
        }
        return worked;
    }
}