class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[k];
        
        // Try all possible lengths for nums1's contribution (i)
        // and nums2's contribution (k-i)
        for (int i = Math.max(0, k - m); i <= Math.min(k, n); i++) {
            int[] candidate = merge(maxArray(nums1, i), maxArray(nums2, k - i), k);
            if (greater(candidate, 0, ans, 0)) {
                ans = candidate;
            }
        }
        return ans;
    }

    // Sub-problem 1: Find the max sequence of length k from one array
    private int[] maxArray(int[] nums, int k) {
        int n = nums.length;
        int[] stack = new int[k];
        int top = 0;
        for (int i = 0; i < n; i++) {
            // While we have enough elements left and current is bigger than stack top
            while (top > 0 && stack[top - 1] < nums[i] && n - i > k - top) {
                top--;
            }
            if (top < k) {
                stack[top++] = nums[i];
            }
        }
        return stack;
    }

    // Sub-problem 2: Merge two arrays to get the max lexicographical result
    private int[] merge(int[] nums1, int[] nums2, int k) {
        int[] res = new int[k];
        int i = 0, j = 0;
        for (int r = 0; r < k; r++) {
            // Use the greater helper to decide which element to pick next
            res[r] = greater(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];
        }
        return res;
    }

    // Helper: Compare two arrays starting from specific indices
    private boolean greater(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
    }
}