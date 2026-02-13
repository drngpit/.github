// Last updated: 2/13/2026, 10:18:31 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length - 1; i++) {
        //     int c = i + 1;
        //     int d = nums[i] + nums[c];
        //     if (target == d) {
        //         return new int[]{i, c}; 
        //     }
        // }
        // return new int[]{}; 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};
    }
}
