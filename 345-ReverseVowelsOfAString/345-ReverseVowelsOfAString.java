// Last updated: 2/13/2026, 10:18:06 AM
class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder vowelList = new StringBuilder();
        int[] positions = new int[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                positions[count] = i;
                vowelList.append(s.charAt(i));
                count++;
            }
        }
        vowelList.reverse();
        StringBuilder res = new StringBuilder(s);

        for (int i = 0; i < count; i++) {
            int pos = positions[i];
            res.setCharAt(pos, vowelList.charAt(i));
        }

        return res.toString();
    }
}
