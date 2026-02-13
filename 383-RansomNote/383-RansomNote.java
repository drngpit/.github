// Last updated: 2/13/2026, 10:18:05 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) return false;
            freq[c - 'a']--;
        }
        return true;
    }
}
