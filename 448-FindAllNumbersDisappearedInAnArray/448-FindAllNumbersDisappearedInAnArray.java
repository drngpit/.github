// Last updated: 2/13/2026, 10:17:59 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        TreeSet<Integer> tree = new TreeSet<>();
        for (int x : nums) {
            tree.add(x);
        }

        int n = nums.length;
        List<Integer> list = new ArrayList<>(Collections.nCopies(n, null));
        for (int x : tree) {
            list.set(x - 1, x);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (list.get(i) == null) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
