import javax.swing.tree.TreeNode;

public class ValidBST {
     TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        // Check left subtree
        if (!isValidBST(root.left)) {
            return false;
        }

        // Check current node
        if (prev != null && prev.val >= root.val) {
            return false;
        }

        prev = root;
  return isValidBST(root.right);
    }
        // Check right subtree
}
