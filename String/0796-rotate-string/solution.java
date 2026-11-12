class Solution {
    public boolean rotateString(String s, String goal) {
        int k = 1;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.equals(goal)){
                return true;
            }
            s = s.substring(k) + s.substring(0 , k);
        }
        return false;
    }
}