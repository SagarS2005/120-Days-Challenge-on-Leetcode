/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, TreeNode> parent = new HashMap<>(); // it will store are node with their parent
        buildParent(root, null, parent);  

        Set<TreeNode> ancestor = new HashSet<>();

        while(p != null){
            ancestor.add(p);
            p = parent.get(p);  // update p with their parent (flow :- child to parent)
        }

        while(!ancestor.contains(q)){   // match until the parent not exist into ancestor set
            q = parent.get(q);   // getting parent from parent map
        }

        return q;
    }

    private void buildParent(TreeNode root, TreeNode father, Map<TreeNode, TreeNode> map){
        if(root == null) return;

        map.put(root, father);
        buildParent(root.left, root, map);
        buildParent(root.right, root, map);
    }
}