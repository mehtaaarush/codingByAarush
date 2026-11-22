class Solution {
    public boolean checkString(String s) {
        int i;
        for(i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'b'){
                break;
            }
        }
        for(int j = i + 1 ; j < s.length() ; j++){
            if(s.charAt(j) == 'a'){
                return false;
            }
        }
        return true;
    }
}