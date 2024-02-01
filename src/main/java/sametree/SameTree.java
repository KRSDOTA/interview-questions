package sametree;

public class SameTree {

    /**
     * Test if two trees are the same
     *
     * We qualify "same" as having the same tree and value structure.
     *
     * So branching must be the same as well as values of the tree
     *
     * @param p first tree
     * @param q second tree
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (!doBranchesMatch(p, q) || p.val != q.val) {
            return false;
        }

        isSameTree(p.left, q.left);
        isSameTree(p.right, q.right);

        return true;
    }

    private boolean doBranchesMatch(TreeNode p, TreeNode q) {
        return (p.right != null && q.right == null) || (q.right != null && p.right == null) ||
                (p.left != null && q.left == null) || (q.left != null && p.left == null);

    }

}
