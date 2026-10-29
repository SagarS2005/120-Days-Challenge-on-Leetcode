class Solution {
    int res = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            findSum(node, targetSum, 0);

            if (node.left != null)
                stack.push(node.left);

            if (node.right != null)
                stack.push(node.right);
        }

        return res;
    }

    private void findSum(TreeNode root, int targetSum, long currentSum){
        if(root == null) return ;
        currentSum += root.val;
        if(currentSum == targetSum) res++;
        findSum(root.left, targetSum, currentSum);
        findSum(root.right, targetSum, currentSum);
    }
}