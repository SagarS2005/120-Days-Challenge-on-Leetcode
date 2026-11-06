class Solution {
    
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;

        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            
            boolean foundX = false;
            boolean foundY = false;

            for(int i = 0; i< size; i++){
                TreeNode node = queue.poll();
                
                if(node.val == x){
                    foundX = true;
                }
                
                if(node.val == y){
                    foundY = true;
                }

                if(node.left != null && node.right != null){
                    
                    if( (node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x) )   // same parent, means they are siblings , not cousins
                    {

                        return false;
                    }
                }

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            
            if(foundX && foundY){
                return true;
            }

            if(foundX || foundY) {
                return false;
            }
        }
        return false;
    }

   
    // public boolean isCousins(TreeNode root, int x, int y) {
    //     dfs(root, null, x, y , 0);
    //     return xDepth == yDepth && xParent != yParent;
    // }

    // private void dfs(TreeNode node, TreeNode parent, int x, int y , int level){
    //     if(node == null) return;

    //     if(node.val == x){
    //         xParent = parent;
    //         xDepth = level;
    //     }
    //     if(node.val == y){
    //         yParent  = parent;
    //         yDepth = level;
    //     }

    //     dfs(node.left, node, x, y , level +1);
    //     dfs(node.right, node, x, y , level +1);
    // }
}