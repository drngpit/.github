// Last updated: 2/13/2026, 10:18:15 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);  
        int[] rev = new int[nums.length];
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            rev[count++] = nums[i];
        }
        return rev[k - 1]; 
    }
}
