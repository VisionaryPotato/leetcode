package src.BinaryTrees;
public class invertBinaryTree {
     public static class TreeNode {
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
    public static void swap(TreeNode root){
        if(root == null) {return;}
        TreeNode tempRoot = root.left;
        root.left = root.right;
        root.right = tempRoot;
        swap(root.left);
        swap(root.right);

    }
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
}
