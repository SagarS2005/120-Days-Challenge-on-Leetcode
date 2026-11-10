class Solution {
    Map<TreeNode, Integer> map = new HashMap<>();

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        map.put(null, 0);
        return getLCA(root);
    }

    private TreeNode getLCA(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode leftLCA = getLCA(root.left);
        TreeNode rightLCA = getLCA(root.right);

        int leftDepth = map.get(leftLCA);
        int rightDepth = map.get(rightLCA);

        // If both subtrees have the exact same max depth, current root is the new LCA
        if (leftDepth == rightDepth) {
            map.put(root, leftDepth + 1);
            return root;
        }

        // Otherwise, pass up the LCA from the deeper subtree and update its depth
        if (leftDepth > rightDepth) {
            map.put(leftLCA, leftDepth + 1);
            return leftLCA;
        } else {
            map.put(rightLCA, rightDepth + 1);
            return rightLCA;
        }
    }
}
