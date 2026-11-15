class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode parent = null, curr = root;

        while (curr != null && curr.val != key) {
            parent = curr;
            curr = key < curr.val ? curr.left : curr.right;
        }
        if (curr == null) return root;   

        if (curr.left != null && curr.right != null) {
            TreeNode succParent = curr;
            TreeNode succ = curr.right;
            while (succ.left != null) { succParent = succ; succ = succ.left; }
            curr.val = succ.val;
            curr = succ;
            parent = succParent;
        }

        TreeNode child = (curr.left != null) ? curr.left : curr.right;
        if (parent == null) return child;                    
        if (parent.left == curr) parent.left = child;
        else parent.right = child;

        return root;
    }
}