class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current.val == subRoot.val) {
                if (isSameTree(current, subRoot)) {
                    return true;
                }
            }

            // Continue the Outer BFS traversal
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return false;
    }
    public boolean isSameTree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> subQueue = new LinkedList<>();

        queue.offer(root);
        subQueue.offer(subRoot);

        while(!queue.isEmpty() && !subQueue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode node2 = subQueue.poll();

            if (node == null && node2 == null) continue;
            
            // Fix 1: If only one is null, or values don't match, they are different trees!
            if (node == null || node2 == null) return false;
            if (node.val != node2.val) return false;

                queue.offer(node.left);
                subQueue.offer(node2.left);
            
                queue.offer(node.right);
                subQueue.offer(node2.right);
            
            
        }  

        return queue.isEmpty() && subQueue.isEmpty();  
    }
}