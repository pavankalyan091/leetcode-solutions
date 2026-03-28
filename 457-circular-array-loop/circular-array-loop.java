class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        if (n <= 1) return false;

        for (int i = 0; i < n; i++) {
            // Skip if we've already visited this index or it's 0
            if (nums[i] == 0) continue;

            int slow = i;
            int fast = getNext(nums, i);

            // Ensure direction is consistent: (nums[i] > 0) == (nums[fast] > 0)
            while (nums[i] * nums[fast] > 0 && nums[i] * nums[getNext(nums, fast)] > 0) {
                if (slow == fast) {
                    // Check if loop length is > 1
                    if (slow == getNext(nums, slow)) break;
                    return true;
                }
                slow = getNext(nums, slow);
                fast = getNext(nums, getNext(nums, fast));
            }

            // Mark visited indices as 0 to avoid re-processing O(n)
            int curr = i;
            int val = nums[i];
            while (nums[curr] * val > 0) {
                int next = getNext(nums, curr);
                nums[curr] = 0;
                curr = next;
            }
        }
        return false;
    }

    private int getNext(int[] nums, int index) {
        int n = nums.length;
        // Formula to handle circular indexing and negative jumps
        int next = (index + nums[index]) % n;
        if (next < 0) next += n;
        return next;
    }
}