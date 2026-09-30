import javax.swing.tree.TreeNode;

public class SymmetricTree {
     public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }

    public boolean mirror(TreeNode left, TreeNode right) {

        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        if (left.val != right.val)
            return false;

        return mirror(left.left, right.right)
            && mirror(left.right, right.left);
    }
}
