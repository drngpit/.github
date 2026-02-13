// Last updated: 2/13/2026, 10:37:42 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case

        int k = 1; // Pointer for the position of next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Place unique element at index k
                k++;
            }
        }

        return k; // Number of unique elements
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1,1,2};
        int k1 = sol.removeDuplicates(nums1);
        System.out.println("k = " + k1);
        System.out.print("nums = [");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + (i < k1 - 1 ? "," : ""));
        }
        System.out.println("]");

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int k2 = sol.removeDuplicates(nums2);
        System.out.println("k = " + k2);
        System.out.print("nums = [");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + (i < k2 - 1 ? "," : ""));
        }
        System.out.println("]");
    }
}
