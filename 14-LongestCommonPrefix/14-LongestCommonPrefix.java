// Last updated: 2/13/2026, 10:18:28 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = strs[0];
        String p = strs[strs.length-1];
        String res="";
        for(int i=0;i<s.length();i++){
           if((s.charAt(i))!=((p.charAt(i)))){
               break; 
           }else if((s.charAt(i))==((p.charAt(i)))){
               res=res+s.charAt(i);
           }
        }
        return res;
        
    }
}