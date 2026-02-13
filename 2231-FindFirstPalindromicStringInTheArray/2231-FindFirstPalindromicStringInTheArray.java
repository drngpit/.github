// Last updated: 2/13/2026, 10:17:39 AM
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder s=new StringBuilder(words[i]);
            s.reverse();
            if(words[i].equals(s.toString())){
                return words[i];
            }
        }
        String k="";
        return k;
    }
}