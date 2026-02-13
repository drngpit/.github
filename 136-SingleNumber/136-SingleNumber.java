// Last updated: 2/13/2026, 10:18:17 AM
class Solution {
    public int singleNumber(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
           int count=0;
           for(int j=0;j<nums.length;j++){
             if(nums[i]==nums[j]&&i!=j){
                count++;
             }
           }
           if(count==0){
             index=nums[i];
           }
        }
        return index;
    }
}