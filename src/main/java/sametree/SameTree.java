package sametree;

import java.util.Stack;

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
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        final Stack<Integer> qNodeStack = new Stack<>();
        final Stack<Integer> pNodeStack = new Stack<>();

        populateNodeStack(p, pNodeStack);
        populateNodeStack(q, qNodeStack);

        return qNodeStack.equals(pNodeStack);
    }

    /**
     * Take a reference to a node and nodestack, if the node isn't null, add it to the stack and recursively
     * do the same for left and right branch
     */
    private void populateNodeStack(TreeNode node, Stack<Integer> nodeStack) {
        if(node != null) {
            nodeStack.add(node.val);
            populateNodeStack(node.left, nodeStack);
            populateNodeStack(node.right, nodeStack);
        } else {
            nodeStack.add(null);
        }
    }

}
