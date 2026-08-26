class Solution {

    int l = 0;
    int count = 0;

    // Count nodes in a subtree
    private void len(TreeNode root) {

        if (root == null) {
            return;
        }

        l++;

        len(root.left);
        len(root.right);
    }

    // Find kth smallest inside a subtree using inorder
    private int small(TreeNode root, int k) {

        if (root == null) {
            return -1;
        }

        int leftResult = small(root.left, k);

        if (leftResult != -1) {
            return leftResult;
        }

        count++;

        if (count == k) {
            return root.val;
        }

        return small(root.right, k);
    }

    // Search kth element inside right subtree
    private int right(TreeNode root, int k) {

        if (root == null) {
            return -1;
        }

        int leftResult = right(root.left, k);

        if (leftResult != -1) {
            return leftResult;
        }

        count++;

        if (count == k) {
            return root.val;
        }

        return right(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {

        // Count ONLY nodes smaller than root
        len(root.left);

        // Case 1: answer is in left subtree
        if (k <= l) {
            count = 0;
            return small(root.left, k);
        }

        // Case 2: root itself is kth smallest
        if (k == l + 1) {
            return root.val;
        }

        // Case 3: answer is in right subtree
        count = 0;

        return right(root.right, k - l - 1);
    }
}