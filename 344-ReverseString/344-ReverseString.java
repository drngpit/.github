// Last updated: 2/13/2026, 10:18:07 AM
class Solution {
    public void reverseString(char[] s) {
        char[] temp = new char[s.length];
        int count = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            temp[count] = s[i];
            count++;
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = temp[i];
        }
    }
}
