// Last updated: 2/13/2026, 10:37:47 AM
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int rev = 0, temp = x;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev == temp;
    }
}
