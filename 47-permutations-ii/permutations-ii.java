import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: sort
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, result, new ArrayList<>(), visited);
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result,
                           List<Integer> current, boolean[] visited) {
        
        // Base case
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            
            // Skip already used elements
            if (visited[i]) continue;

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;

            // Choose
            visited[i] = true;
            current.add(nums[i]);

            // Explore
            backtrack(nums, result, current, visited);

            // Undo (backtrack)
            visited[i] = false;
            current.remove(current.size() - 1);
        }
    }
}