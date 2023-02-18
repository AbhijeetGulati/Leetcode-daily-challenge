
//Given the root of a binary tree, invert the tree, and return its root.
public class Feb18 {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
        public TreeNode invertTree(TreeNode root) {
        //base case
            if(root==null){
                return null;
            }
            //traversal 
            TreeNode left=invertTree(root.left);
            TreeNode right=invertTree(root.right);//now we have reached the children of the root node now we will make the swap or interchange the values of the node
            root.left=right;
            root.right=left;
            return root;
                    
        }
    
}
