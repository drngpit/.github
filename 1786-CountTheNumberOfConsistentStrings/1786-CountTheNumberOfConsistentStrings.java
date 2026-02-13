// Last updated: 2/13/2026, 10:37:32 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];
        for (char c : allowed.toCharArray()) {
            allowedChars[c - 'a'] = true;
        }
        
        int count = 0;
        for (String word : words) {
            boolean consistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedChars[c - 'a']) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) count++;
        }
        
        return count;
    }
}
