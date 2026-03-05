class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] ok = new boolean[26];
        
        for(char c : allowed.toCharArray()){
            ok[c - 'a'] = true;
        }
        
        int count = 0;
        
        for(String w : words){
            boolean valid = true;
            
            for(char c : w.toCharArray()){
                if(!ok[c - 'a']){
                    valid = false;
                    break;
                }
            }
            
            if(valid) count++;
        }
        
        return count;
    }
}