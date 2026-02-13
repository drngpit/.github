// Last updated: 2/13/2026, 10:17:50 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char ch[] = stones.toCharArray();
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<ch.length;j++){
            if(jewels.charAt(i)==ch[j]){
                count++;
            }
            }
        }
        return count;
    }
}