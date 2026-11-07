class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        String word = words[words.length - 1];
        int length = 0;

        for(int i = 0 ; i < word.length() ; i++){
            length++;
        }
        return length;
    }
}