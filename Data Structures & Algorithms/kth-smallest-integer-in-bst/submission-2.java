class Solution {

    int count;
    int answer;

    public int kthSmallest(TreeNode root, int k) {

        count = k;

        dfs(root);

        return answer;
    }

    private void dfs(TreeNode node) {

        if (node == null) {
            return;
        }

        // 1. Visit left subtree
        dfs(node.left);

        // Answer already found
        if (count == 0) {
            return;
        }

        // 2. Visit current node
        count--;

        if (count == 0) {
            answer = node.val;
            return;
        }

        // 3. Visit right subtree
        dfs(node.right);
    }
}