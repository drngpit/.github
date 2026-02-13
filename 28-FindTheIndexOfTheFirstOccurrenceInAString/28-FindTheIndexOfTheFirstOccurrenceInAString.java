// Last updated: 2/13/2026, 10:18:25 AM
class Solution {
    public int strStr(String haystack, String needle) {
        int n=-1;
        if(haystack.contains(needle)){
            n=haystack.indexOf(needle);
        }else{
            n=-1;
        }
        return n;
    }
}