class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character , String> map = new HashMap<>();
        String[] words = s.split("\\s+");

        if(pattern.length() != words.length){
            return false;
        }

        for(int i = 0 ; i < pattern.length() ; i++){
            char a = pattern.charAt(i);
            String b = words[i];
        

        if(map.containsKey(a)){
                if(!map.get(a).equals(b)){
                    return false;
                }
        }else{
                if(map.containsValue(b)){
                    return false;
                }

                map.put(a, b);
            }
        }
            return true;
        }

        
    }
