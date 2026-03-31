import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length < 2 || k < 1 || t < 0) return false;

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long current = (long) nums[i];

            // Find the smallest element >= current - t
            Long floor = set.ceiling(current - t);

            // Check if that element is also <= current + t
            if (floor != null && floor <= current + t) {
                return true;
            }

            set.add(current);

            // Maintain the sliding window of size k
            if (set.size() > k) {
                set.remove((long) nums[i - k]);
            }
        }

        return false;
    }
}