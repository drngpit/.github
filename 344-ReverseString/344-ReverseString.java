// Last updated: 09/02/2026, 13:56:59
class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<r){
        char a=s[l];
        s[l]=s[r];
        s[r]=a;
        l++;
        r--;
        }
    }
}