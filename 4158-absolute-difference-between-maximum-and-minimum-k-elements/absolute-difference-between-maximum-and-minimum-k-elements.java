class Solution {
    public int absDifference(int[] nums, int k) {

        // sort the array
        Arrays.sort(nums);

        int smallSum = 0;
        int largeSum = 0;

        // k smallest elements
        for(int i = 0; i < k; i++) {
            smallSum += nums[i];
        }

        // k largest elements
        for(int i = nums.length - 1; i >= nums.length - k; i--) {
            largeSum += nums[i];
        }

        // absolute difference
        return Math.abs(largeSum - smallSum);
    }
}