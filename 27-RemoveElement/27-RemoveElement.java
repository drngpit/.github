// Last updated: 2/13/2026, 10:37:41 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for next non-val position
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
