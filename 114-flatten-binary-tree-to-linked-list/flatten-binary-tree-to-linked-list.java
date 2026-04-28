class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        
        while (curr != null) {
            if (curr.left != null) {
                // Find rightmost node of left subtree
                TreeNode temp = curr.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                
                // Connect right subtree
                temp.right = curr.right;
                
                // Move left subtree to right
                curr.right = curr.left;
                curr.left = null;
            }
            
            // Move to next node
            curr = curr.right;
        }
    }
}