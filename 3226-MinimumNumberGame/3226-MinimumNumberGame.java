// Last updated: 2/13/2026, 10:17:41 AM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int res[]=new int[nums.length];
        int k=0;
        for(int i=1;i<nums.length;i=i+2){
               res[k]=nums[i];
               k=k+2;
        }
        int g=1;
        for(int i=0;i<nums.length;i=i+2){
               res[g]=nums[i];
               g=g+2;
        }
        return res;

    }
}