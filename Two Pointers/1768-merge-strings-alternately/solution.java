class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int l1 = word1.length();
        int l2 = word2.length();

        if(l1 == l2){
            for(int i = 0 ; i < l1 ; i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            }
        }
        else if(l1 < l2){
            for(int i = 0 ; i < l1 ; i++){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            for(int i = l1 ; i < l2 ; i++){
                result.append(word2.charAt(i));
            }
        }else{
            for(int i = 0 ; i < l2 ; i++){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            for(int i = l2 ; i < l1 ; i++){
                result.append(word1.charAt(i));

        }
        
        }
        return result.toString();
    }
    
}