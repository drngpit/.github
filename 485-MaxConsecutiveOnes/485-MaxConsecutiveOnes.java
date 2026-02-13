// Last updated: 2/13/2026, 10:17:57 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,pre=0,index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                if(pre<count){
                    pre=count;
                }
                count=0;
            }
        }
        if(pre<count)
         return count;
        else
         return pre;
    }
}